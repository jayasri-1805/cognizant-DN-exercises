# Creating Microservices for Account and Loan

## Overview

This project demonstrates the implementation of two independent Spring Boot microservices: **Account Service** and **Loan Service**. Each service exposes REST APIs and can run independently, following the microservices architecture.

The project is developed as part of the Cognizant Digital Nurture Microservices hands-on exercises.

---

## Technologies Used

- Java 8
- Spring Boot
- Spring Web
- Maven
- REST API
- Eclipse / IntelliJ IDEA / VS Code

---

## Project Structure

```
Creating Microservices for account and loan/
│
├── account/
│   ├── src/
│   ├── pom.xml
│   └── ...
│
├── loan/
│   ├── src/
│   ├── pom.xml
│   └── ...
│
└── Output.pdf
```

---

## Modules

### Account Microservice

The Account Service provides REST endpoints related to customer account information.

**Features**
- Spring Boot REST API
- Returns account details
- Independent microservice
- Runs on its own server

---

### Loan Microservice

The Loan Service provides REST endpoints related to customer loan information.

**Features**
- Spring Boot REST API
- Returns loan details
- Independent microservice
- Runs separately from the Account Service

---

## Prerequisites

Before running the project, install:

- Java 8 or above
- Maven
- Eclipse / IntelliJ IDEA / VS Code
- Git

---

## How to Run

### Clone the Repository

```bash
git clone <repository-url>
```

### Run Account Microservice

```bash
cd account
mvn spring-boot:run
```

or

Run the main Spring Boot application class from your IDE.

---

### Run Loan Microservice

```bash
cd loan
mvn spring-boot:run
```

or

Run the main Spring Boot application class from your IDE.

---

## REST Endpoints

### Account Service

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/accounts/{number}` *(or configured endpoint)* | Fetch account details |

### Loan Service

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/loans/{number}` *(or configured endpoint)* | Fetch loan details |

> *Note:* Replace the endpoint paths with the ones configured in your project if they differ.

---

## Learning Outcomes

After completing this exercise, you will be able to:

- Build independent Spring Boot microservices.
- Develop RESTful web services.
- Structure applications using the microservices architecture.
- Run multiple services independently.
- Understand service decomposition and modular application design.

---

## Output

The project output is included as:

- **Output.pdf**

---

## Author

**Jaya Sri**

B.Tech – Computer Science and Engineering (AI & DS)

Vishnu Institute of Technology

---

## License

This project is created for educational purposes as part of the Cognizant Digital Nurture Program.
