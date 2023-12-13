# Bionic Foods REST API

Welcome to the Bionic Foods REST API. This API allows you to access, manage, and manipulate data related to foods and their corresponding attributes.

## API Documentation

Here is the API documentation for the Bionic Foods REST API:

- **GET /foods**: Retrieves a list of all foods in the database.
- **GET /foods/{id}**: Retrieves a specific food by its unique ID.
- **POST /foods**: Creates a new food and adds it to the database.
- **PATCH /foods/{id}**: Updates an existing food by its unique ID.
- **DELETE /foods/{id}**: Deletes an existing food by its unique ID.

## Installation

To run this application, you need to have the following installed on your system:

- Java 20 or higher
- Maven 3.8.3 or higher

After ensuring the required software is installed, you can follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/adhxabre/bionic-java.git
   ```

2. Navigate to the project directory:

   ```bash
   cd bionic-java
   ```

3. Run the application using Maven:

   ```bash
   mvn spring-boot:run
   ```

   The application will start running and will be accessible via `http://localhost:6161`.
