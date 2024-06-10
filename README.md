# 🍕 Pizza Creed Backend 🍕
Pizza Creed Backend is a robust Java web application powered by the Spring Framework and REST API architecture. Seamlessly manage pizza products and enable smooth shopping basket functionalities. This project features an intuitive admin console for streamlined product management, alongside REST endpoints for effortless browsing, basket management, and checkout processes.

🚀 Developed with JDK 17+, Spring MVC, and Spring Data JPA, Pizza Creed Backend ensures efficiency and scalability for your pizza e-commerce platform. Enhance your pizza business with this versatile and reliable backend solution!

<h3>Key Features:</h3>
<ul>
  <li>Spring Framework & REST API architecture</li>
  <li>Admin console for product management</li>
  <li>REST endpoints for browsing, basket management, and checkout</li>
  <li>Built with JDK 17+, Spring MVC, and Spring Data JPA</li>
</ul>

## Table of Contents
- [Introduction](#introduction)
- [Setup](#setup)
  - [Prerequisites](#prerequisites)
  - [Database Configuration](#database-configuration)
  - [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Postman Collection](#postman-collection)
- [Documentation](#documentation)
- [Admin Panel](#admin-panel)

## Introduction

Pizza Creed is a Spring Boot application providing RESTful APIs for managing pizza orders. It includes functionalities such as listing available pizzas, creating shopping baskets, managing basket items, and checking out orders.

## Setup

### Prerequisites

Ensure you have the following installed on your system:

- Java Development Kit (JDK) - [Download and Install JDK](https://adoptopenjdk.net/)
- Maven Wrapper - Included in the project
- MySQL Database - [Download and Install MySQL](https://dev.mysql.com/downloads/)

### Database Configuration

1. Create a MySQL database for the application with the name `pizzacreed`.
2. Navigate to `src/main/resources` and locate the `application.properties.template` file.
3. Duplicate the `application.properties.template` file and remove the `.template` extension, creating a new file named `application.properties`.
4. Open the `application.properties` file in a text editor.
5. Update the file with your database details, including the username and password.

### Running the Application

1. Open a terminal and navigate to the project directory.
2. Run the following command:
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```
   (On Windows, use `mvnw` instead of `./mvnw`)
   
3. The application should now be running at `http://localhost:8181`.

## Endpoints
Refer to the [Postman Collection](https://www.postman.com/speeding-capsule-928798/workspace/nibm-ead-2/collection/30452672-92f8720f-f44f-4fe4-b82f-9e1b98d1a2a5?action=share&creator=30452672) for detailed API endpoints and sample requests.

## Postman Collection
Explore and test the API using the [Postman Collection](https://www.postman.com/speeding-capsule-928798/workspace/nibm-ead-2/collection/30452672-92f8720f-f44f-4fe4-b82f-9e1b98d1a2a5?action=share&creator=30452672).

## Documentation
Check out the detailed API documentation on [Postman Documentation](https://documenter.getpostman.com/view/35088245/2sA3XJnREA).

## Admin Panel
The admin panel can be accessed at `http://localhost:8181/login` with the following credentials:

- Username: admin
- Password: admin
