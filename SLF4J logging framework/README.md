# SLF4J Logging Framework – Logging Exercise

## Overview

This project demonstrates the use of the **Simple Logging Facade for Java (SLF4J)** in a Spring Boot application. It shows how to configure logging and use different log levels to improve application monitoring and debugging.

This exercise is part of the **Cognizant Digital Nurture Program** on JUnit, Mockito, and SLF4J.

---

## Technologies Used

- Java 8
- Spring Boot
- Maven
- SLF4J
- Logback (Default SLF4J Implementation)
- Eclipse / IntelliJ IDEA / VS Code

---

## Project Structure

```
SLF4J Logging Framework/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── jayasri/
│                   └── logging/
│                         └── LoggingExample.java
│
├── pom.xml
└── README.md
```

---

## Objectives

- Understand the purpose of logging in Java applications.
- Configure SLF4J with Spring Boot.
- Implement logging using different log levels.
- Improve application debugging and monitoring.

---

## Logging Levels Used

| Log Level | Purpose |
|-----------|---------|
| TRACE | Detailed execution flow information |
| DEBUG | Debugging application logic |
| INFO | General application events |
| WARN | Potential issues that require attention |
| ERROR | Errors and exceptions during execution |

---

## Features

- SLF4J Logger implementation
- Console-based logging
- Different logging levels
- Spring Boot integration
- Easy-to-read log messages

---

## Prerequisites

Before running the project, ensure you have:

- Java 8 or above
- Maven
- Git
- Eclipse / IntelliJ IDEA / VS Code

---

## How to Run

### Clone the Repository

```bash
git clone <repository-url>
```

### Navigate to the Project

```bash
cd "SLF4J Logging Framework"
```

### Run Using Maven

```bash
mvn spring-boot:run
```

Or execute the main Spring Boot application class from your IDE.

---

## Expected Output

When the application runs, log messages will be displayed in the console similar to:

```text
INFO  - Application started successfully.
DEBUG - Loading application configuration.
WARN  - Configuration file not found. Using default values.
ERROR - Exception occurred while processing request.
```

The actual output may vary depending on the implemented logging statements.

---

## Learning Outcomes

After completing this exercise, you will be able to:

- Configure SLF4J in a Maven project.
- Implement logging using different log levels.
- Understand the importance of logging in application development.
- Debug applications efficiently using structured log messages.
- Follow logging best practices in Spring Boot applications.

---

## Author

**Jaya Sri**

B.Tech – Computer Science and Engineering (Artificial Intelligence & Data Science)

Vishnu Institute of Technology

---

## License

This project is created for educational purposes as part of the Cognizant Digital Nurture Program.
```
