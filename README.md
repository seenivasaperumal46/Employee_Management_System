## 🧑‍💼 Employee Management System

This is a simple Employee Management System built using Java Spring Boot, Spring Data JPA, MySQL, and Maven. It demonstrates basic CRUD operations—Create, Read, Update, and Delete—through RESTful APIs. The project serves as a foundational backend application, making it ideal for beginners who want to learn how to build and structure Java-based Spring Boot applications with database connectivity.
.

## 🚀 Features

- Add a new employee
- View all employees
- Get employee details by ID
- Update employee details
- Delete employee

## 🧱 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL 8.x
- Maven
- Lombok
- IntelliJ IDEA
- Postman (for API testing)

---

## ⚙️ Project Structure

## Project Structure

``` src/
└── main/
    ├── java/
    │   └── com/
    │       └── project/
    │           └── springboot/
    │               ├── controller/          # REST controllers
    │               ├── exception/           # Custom exception classes
    │               ├── model/               # Employee entity
    │               ├── repository/          # Spring Data JPA repositories
    │               └── SpringbootApplication.java
    └── resources/
        ├── application.properties           # Spring Boot configuration
        ├── static/                          # Static assets (optional)
        ├── templates/                       # Thymeleaf templates (optional)
        └── ...
``` 
## 🔧 Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/seenivasaperumal46/Employee_Management_System.git
cd Employee_Management_System
``` 

### 2. Open in IntelliJ IDEA
 - Open the project using IntelliJ IDEA.
 - Make sure Maven is enabled in your IDE.

### 3. Setup MySQL
Create a database in MySQL:

``` CREATE DATABASE employee_db;``` 

### 4. Configure application.properties
``` 
Update the following properties in src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
``` 

### 5. Build & Run
Use Maven to build and run the application:
mvn spring-boot:run

### API Endpoints

| Method | Endpoint                    | Description          |
|--------|-----------------------------|----------------------|
| GET    | `/api/v1/employees`         | Get all employees    |
| GET    | `/api/v1/employees/{id}`    | Get employee by ID   |
| POST   | `/api/v1/employees`         | Add new employee     |
| PUT    | `/api/v1/employees/{id}`    | Update employee      |
| DELETE | `/api/v1/employees/{id}`    | Delete employee      |

> 🛠️ Use Postman or any REST client to test the endpoints.
