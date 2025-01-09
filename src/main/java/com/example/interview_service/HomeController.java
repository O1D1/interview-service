package com.example.interview_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcomeMessage() {
        return """
            Willkommen zum Produkt-API-Service!

            Verfügbare Endpunkte:
            1. GET /products - Gibt alle Produkte zurück.
            2. GET /products?category=KATEGORIE_ODER_TAG - Filtert Produkte nach Kategorie oder Tag (z. B. 'beauty', 'mascara').
            3. GET /products/{id} - Gibt das Produkt mit der angegebenen ID zurück.
            4. GET /products/hello - Gibt die Nachricht "Hello World" zurück.

            Beispielaufrufe:
            - Alle Produkte anzeigen: http://localhost:8080/products
            - Produkte nach Kategorie 'beauty' filtern: http://localhost:8080/products?category=beauty
            - Produkt mit ID 1 anzeigen: http://localhost:8080/products/1
            - Hello World testen: http://localhost:8080/products/hello
        """;
    }
}

