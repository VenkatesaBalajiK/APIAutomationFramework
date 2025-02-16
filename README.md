# API Automation Framework

## Overview
This API Automation Framework is built using Java, Rest Assured, and TestNG. It provides a structured approach to automate API testing with features such as request and response models, logging filters, and service layer abstractions.

## Technologies Used
- **Java** (Programming Language)
- **Rest Assured** (API Testing Library)
- **TestNG** (Test Framework)
- **GitHub Actions** (CI/CD Integration)

## Project Structure
```
APIAutomationFramework
│── src/main/java
│   ├── com.api.filters
│   │   └── LoggingFilter.java
│   ├── com.api.listeners
│   │   └── TestListener.java
│   ├── com.api.request.models
│   │   ├── LoginRequestModel.java
│   │   ├── ProfileRequestModel.java
│   │   └── SignupRequestModel.java
│   ├── com.api.response.models
│   │   ├── LoginResponse.java
│   │   └── UserProfileResponse.java
│   ├── com.api.services
│   │   ├── AuthenticationService.java
│   │   ├── BaseService.java
│   │   └── UserProfileManagementService.java
│── src/test/java
│   ├── com.api.tests
│   │   ├── AuthenticationTests.java
│   │   └── UserManagementTests.java
```

## Setup & Execution
### Prerequisites
- Java (JDK 11 or later)
- Maven (for dependency management)

### Steps to Run Tests
1. Clone the repository:
   ```sh
   git clone https://github.com/VenkatesaBalajiK/APIAutomationFramework.git
   ```
2. Navigate to the project directory:
   ```sh
   cd APIAutomationFramework
   ```
3. Run tests using the TestNG suite:
   ```sh
   mvn test -DsuiteXmlFile=suite
   ```

## CI/CD Integration
This framework is integrated with **GitHub Actions** for automated test execution. Each push or pull request triggers the test suite to run.

## License
This project is open-source and available for educational purposes.

## Author
[Venkatesa Balaji K](https://github.com/VenkatesaBalajiK)

