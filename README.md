# FIS Java Portfolio

A responsive developer portfolio built with Java and Spring Boot to showcase my projects, technical skills, and software development journey.

## About the Project

The FIS Java Portfolio serves as a central place to explore my Java projects and learn about the technologies used to build them. It is designed to present my work clearly to recruiters, employers, and fellow developers.

## Featured Projects

### 1. JobConnect — Job Recruitment Platform

A Spring Boot job recruitment application designed to connect job seekers with employers.

**Key features:**
- Job seeker and employer roles
- Job listings and applications
- Application status management
- Role-based access control
- JWT-based authentication

**Technologies:** Java, Spring Boot, MySQL, Spring Security, JWT, and REST API development.

### 2. Fountain Verify — Certificate Verification System

A certificate verification application developed for Fountain Information Service (FIS).

**Key features:**
- Certificate management
- QR code generation and verification
- Public certificate verification
- Certificate status handling, including active, blocked, expired, and revoked certificates
- User authentication and administrative functions

**Technologies:** Java, Spring Boot, MySQL, Spring Security, Thymeleaf, and QR code generation.

### 3. FIS Java Portfolio — Developer Portfolio Website

The portfolio application itself, built to showcase my software projects and development skills.

**Key features:**
- Project overview and detail pages
- Responsive web presentation
- Dedicated pages for featured projects
- Java and Spring Boot application structure

**Technologies:** Java, Spring Boot, Thymeleaf, HTML, and CSS.

## Technology Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Web templating:** Thymeleaf
- **Frontend:** HTML and CSS
- **Build tool:** Maven
- **Version control:** Git and GitHub
- **Databases:** MySQL for the JobConnect and Fountain Verify projects; the portfolio website itself does not require MySQL.

## Run Locally

### Prerequisites

- Java Development Kit (JDK)
- Git
- Maven, or the Maven Wrapper included in this repository

### 1. Clone the repository

```bash
git clone https://github.com/davidmalik2019/fis-java-portfolio.git
```

### 2. Enter the project directory

```bash
cd fis-java-portfolio
```

### 3. Run the application on Windows

```cmd
mvnw.cmd spring-boot:run
```

Alternatively, build the application:

```cmd
mvnw.cmd clean package
```

Then run the generated JAR from the `target` directory:

```cmd
java -jar target/fis-java-portfolio-0.0.1-SNAPSHOT.jar
```

### 4. Open the website

Visit:

`http://localhost:8080`

## Screenshots

Project screenshots are available in the repository under:

`src/main/resources/static/images/`

## Project Status

The portfolio application has been developed locally, and its source code is available in this GitHub repository. Public deployment is planned separately.

## About Me

I am developing my skills in Java backend development, Spring Boot, REST APIs, database integration, authentication, and web application development through practical projects.

## Repository

[View FIS Java Portfolio on GitHub](https://github.com/davidmalik2019/fis-java-portfolio)

---

**Developed as part of the FIS software development portfolio.**
