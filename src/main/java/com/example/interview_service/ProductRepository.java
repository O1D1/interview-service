package com.example.interview_service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public ProductRepository() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Lädt die Datei `products.json` aus dem Ordner `src/main/resources`
        products = List.of(mapper.readValue(Paths.get("src/main/resources/products.json").toFile(), Product[].class));
    }

    // Gibt alle Produkte zurück
    public List<Product> getAllProducts() {
        return products;
    }

    // Gibt ein Produkt basierend auf der ID zurück
    public Product getProductById(final int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Gibt alle Produkte zurück, die zu einer bestimmten Kategorie gehören
    public List<Product> getProductsByCategoryOrTag(String keyword) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(keyword) ||
                    product.getTags().contains(keyword.toLowerCase())) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

}
