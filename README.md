# CA_Spring

## Application Description

This is a simple Spring Boot REST API for managing items in an inventory.  
It uses an H2 file-based database for persistence and provides endpoints to:

- List all items
- Get an item by ID
- Add a new item
- Update the quantity of an item

The main entity is `Item`, which has fields for `id`, `name`, and `quantity`.  
Lombok is used for getters and setters.

---

## How to Set Up

1. **Clone the repository**  
   ```sh
   git clone <your-repo-url>
   cd demo
   ```

2. **Build the project**  
   If using Maven:
   ```sh
   mvn clean install
   ```
   If using Gradle:
   ```sh
   ./gradlew build
   ```

3. **Run the application**  
   ```sh
   mvn spring-boot:run
   ```
   or
   ```sh
   ./gradlew bootRun
   ```

4. **Access the API**  
   The server runs on `http://localhost:8080`.

   - **List all items:**  
     `GET /items`
   - **Get item by ID:**  
     `GET /items/{id}`
   - **Add item:**  
     `POST /items`  
     JSON body:
     ```json
     {
       "name": "Apple",
       "quantity": 10
     }
     ```
   - **Update quantity:**  
     `PUT /items/{id}`  
     JSON body:
     ```json
     {
       "quantity": 5
     }
     ```

5. **Access H2 Console (for debugging):**  
   Visit [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
   - JDBC URL: `jdbc:h2:file:./data/demo-db`
   - User: `sa`
   - Password: `password`

---

**Requirements:**  
- Java 17+  
- Maven or Gradle  
- No external database