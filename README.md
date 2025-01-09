# Interview-Service

Ein einfacher HTTP-Service für die Interview-Challenge, der mit Java und Spring Boot implementiert wurde.

## Funktionen
1. **"Hello World"-Endpoint**: `/products/hello`
2. **Liste aller Produkte**: `/products`
3. **Details eines spezifischen Produkts**: `/products/{id}`
4. **Produkte filtern nach Kategorien oder Tags**: `/products?category=:keyword`

## Voraussetzungen
- **Java 17 oder neuer** (Getestet mit OpenJDK 23.0.1)
- **Maven** (zum Abhängigkeitsmanagement)
- **IntelliJ IDEA** (empfohlene IDE)

## Installation und Ausführung

### 1. Projekt klonen
```bash
git clone https://github.com/deinBenutzername/interview-service.git
cd interview-service
```
### 2. IntelliJ IDEA verwenden
1. **Öffne Intellij IDEA.**
2. **Wähle Open und navigiere zum geklonten Projektverzeichnis.**
3. **Warte, bis Maven die Abhängigkeiten herunterlädt.**

### 3. Anwendung starten
1. **Starte die Datei InterviewServiceApplication.java aus IntelliJ IDEA.**
2. **Alternativ: Führe Maven aus:**
   ```bash
   mvn spring-boot:run
   ```
### 4. Endpunkte testen 
Nach dem Start läuft der Service unter http://localhost:8080.

### 5. Beispiel-Daten 
Die Produktdaten befinden sich in der Datei products.json. Sie werden automatisch beim Start geladen.

## Fehlerbehebung
- **404 Not Found**: Stelle sicher, dass die Endpunkte korrekt aufgerufen werden, z. B. /products statt /product.
- **Port-Konflikt**: Der Standardport ist 8080. Ändere ihn in der Datei application.properties, falls benötigt:
 ```bash
server.port=8081
```
  
