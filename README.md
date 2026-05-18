# CODEALPHA_SNIFER

## Secure Coding Review and Vulnerability Assessment using Java Spring Boot

### Internship Domain
Cybersecurity + Java

---

## Project Description
This project was developed during the Cybersecurity Internship at CodeAlpha. The application demonstrates secure coding practices and vulnerability assessment techniques using Java Spring Boot.

The project focuses on identifying and mitigating common web application vulnerabilities such as:
- SQL Injection
- Cross-Site Scripting (XSS)
- Weak Password Storage
- Hardcoded Credentials
- Insecure File Upload
- Missing Authentication

Secure coding techniques and OWASP best practices were implemented to improve application security.

---

## Technologies Used
- Java 21
- Spring Boot
- Spring Security
- Maven
- MySQL

---

## Security Tools Used
- SpotBugs
- PMD
- OWASP Dependency-Check

---

## Features
- Secure User Registration
- BCrypt Password Encryption
- Role-Based Authentication
- Secure File Upload Validation
- Vulnerability Demonstration
- Static Security Analysis

---

## Project Structure

```text
CODEALPHA_SNIFER/
│
├── src/
├── pom.xml
├── README.md
└── report.pdf
```

---

## How to Run the Project

### Step 1
Clone the repository:

```bash
git clone https://github.com/yourusername/CODEALPHA_SNIFER.git
```

### Step 2
Open the project in IntelliJ IDEA or Eclipse.

### Step 3
Configure MySQL database settings in:

```properties
application.properties
```

### Step 4
Run the application:

```bash
mvn spring-boot:run
```

### Step 5
Access the application:

```text
http://localhost:8080
```

---

## Vulnerabilities Identified

| Vulnerability | Severity |
|---|---|
| SQL Injection | Critical |
| Cross-Site Scripting (XSS) | High |
| Hardcoded Credentials | High |
| Weak Password Storage | Critical |
| Insecure File Upload | High |
| Missing Authentication | Critical |

---

## Secure Coding Practices Implemented
- Input Validation
- Password Encryption using BCrypt
- Role-Based Authorization
- Secure File Handling
- Exception Handling
- Dependency Vulnerability Scanning
- Secure Authentication

---

## Learning Outcomes
- Understanding OWASP Top 10 vulnerabilities
- Performing secure code reviews
- Implementing secure authentication systems
- Applying Java secure coding standards
- Using static analysis security tools

---

## Future Improvements
- JWT Authentication
- Multi-Factor Authentication
- Docker Deployment
- API Rate Limiting
- CI/CD Security Scanning

---

## Author
AKULA GOWRI GEETHIKA SAI SRIJA

Cybersecurity Intern at CodeAlpha

---

## License
This project is for educational and internship purposes.
