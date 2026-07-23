# ClipLink Backend

ClipLink Backend is a RESTful URL shortening service built with **Spring Boot**. It allows users to generate short URLs, securely manage them using JWT authentication, and redirect shortened links to their original destinations.

## Features

- Generate short URLs from long URLs
- Redirect short URLs to the original links
- JWT-based authentication and authorization
- RESTful API architecture
- MySQL database integration
- Swagger/OpenAPI documentation
- Docker support for containerized deployment

## Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- JWT (JJWT)
- Maven
- Docker
- Swagger/OpenAPI

## Project Structure

```
src
├── controller
├── service
├── repository
├── entity
├── security
├── dto
└── config
```

## Getting Started

### Prerequisites

- Java 21
- Maven
- MySQL
- Docker (Optional)

### Clone the Repository

```bash
git clone https://github.com/swastik-banerj/cliplink_url_shortener.git
cd cliplink_url_shortener
```

### Configure Environment Variables

Set the following environment variables:

```properties
DB_URL=jdbc:mysql://localhost:3306/urlshortenerdb
DB_USER=your_username
DB_PASSWORD=your_password
JWT_SECRET=your_jwt_secret
JWT_EXP=172800000
```

### Build the Project

```bash
mvn clean package
```

### Run the Application

```bash
java -jar target/*.jar
```

Or using Docker:

```bash
docker build -t cliplink .
docker run -p 8080:8080 cliplink
```

## API Documentation

Swagger UI is available after starting the application:

```
http://localhost:8080/swagger-ui/index.html
```
## Author

**Swastik Banerjee**

GitHub: https://github.com/swastik-banerj
