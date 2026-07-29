# ☁️ Creating Microservices for Account and Loan

![Java](https://img.shields.io/badge/Java-8-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-Microservices-brightgreen?style=for-the-badge&logo=springboot)
![REST API](https://img.shields.io/badge/REST-API-blue?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-red?style=for-the-badge&logo=apachemaven)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge&logo=github)

## 📖 About

This repository demonstrates the implementation of two independent **Spring Boot Microservices**: **Account Service** and **Loan Service**. Each service exposes REST APIs and operates independently, following the principles of **Microservices Architecture**.

The project is developed as part of the **Cognizant Digital Nurture (DN) Program** to understand service decomposition, modular application design, and RESTful web service development using Spring Boot.

---

## 🎯 Repository Objectives

- Understand the fundamentals of Microservices Architecture.
- Develop independent Spring Boot applications.
- Create RESTful APIs using Spring Boot.
- Learn service decomposition and modular design.
- Run and test multiple services independently.
- Build scalable and maintainable enterprise applications.

---

# 📚 Project Modules

## 📌 Account Microservice

### Description

The **Account Service** provides REST endpoints for retrieving customer account information.

### Features

- Spring Boot REST API
- Retrieves customer account details
- Independent microservice
- Runs on a dedicated server
- Lightweight and modular architecture

---

## 📌 Loan Microservice

### Description

The **Loan Service** provides REST endpoints for retrieving customer loan information.

### Features

- Spring Boot REST API
- Retrieves customer loan details
- Independent microservice
- Runs separately from the Account Service
- Modular service implementation

---

# 💻 Technologies Used

### Programming Language

- Java 8

### Backend

- Spring Boot
- Spring Web
- REST API

### Build Tool

- Maven

### Development Tools

- Eclipse IDE
- IntelliJ IDEA
- Visual Studio Code
- Git
- GitHub

---

# 📂 Repository Structure

```text
Creating Microservices for Account and Loan/
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

## ⚙️ Prerequisites

Before running the project, ensure the following are installed:

- Java 8 or above
- Apache Maven
- Git
- Eclipse / IntelliJ IDEA / VS Code

---

## ▶️ How to Run

### Clone the Repository

```bash
git clone <repository-url>
```

---

### Run Account Microservice

```bash
cd account
mvn spring-boot:run
```

Or run the main Spring Boot application class from your IDE.

---

### Run Loan Microservice

```bash
cd loan
mvn spring-boot:run
```

Or run the main Spring Boot application class from your IDE.

---

## 🌐 REST Endpoints

### Account Service

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/accounts/{number}` | Fetch customer account details |

---

### Loan Service

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/loans/{number}` | Fetch customer loan details |

> **Note:** Replace the endpoint paths with the ones configured in your project if they differ.

---

## 🎓 Learning Outcomes

After completing this project, you will be able to:

- Build independent Spring Boot Microservices.
- Develop RESTful Web Services.
- Understand Microservices Architecture.
- Design modular and scalable applications.
- Run multiple services independently.
- Implement service-based application development.

---

## 📄 Output

The project output is included as:

- **Output.pdf**

---

## 👨‍💻 Author

**Jaya Sri**

B.Tech – Artificial Intelligence & Data Science

Vishnu Institute of Technology

---

## ⭐ Repository Purpose

This repository serves as:

- Microservices Architecture Practice
- Spring Boot REST API Reference
- Academic Laboratory Record
- Placement & Interview Preparation
- Enterprise Java Development Practice
- GitHub Portfolio Showcase

---

## 📄 License

This repository is created for educational and academic purposes.
