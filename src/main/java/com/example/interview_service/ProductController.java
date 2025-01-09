package com.example.interview_service;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository repository;

    // Constructor-Injection für das Repository
    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    // Endpunkt: Gibt alle Produkte zurück, optional gefiltert nach Kategorie oder Tags
    @GetMapping
    public List<Product> getAllProducts(@RequestParam(required = false) String category) {
        if (category != null) {
            List<Product> filteredProducts = new ArrayList<>();
            for (Product product : repository.getAllProducts()) {
                // Überprüft, ob die Kategorie übereinstimmt oder der Tag in der Tags-Liste enthalten ist
                if (product.getCategory().equalsIgnoreCase(category) ||
                        product.getTags().stream().anyMatch(tag -> tag.equalsIgnoreCase(category))) {
                    filteredProducts.add(product);
                }
            }
            return filteredProducts;
        }
        return repository.getAllProducts();
    }


    // Endpunkt: Gibt ein Produkt basierend auf der ID zurück
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        for (Product product : repository.getAllProducts()) {
            if (product.getId() == id) {
                return product;
            }
        }
        throw new IllegalArgumentException("Product not found with ID: " + id);
    }

    // Endpunkt: Gibt "Hello World" zurück
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}

