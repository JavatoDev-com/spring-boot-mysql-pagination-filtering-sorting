# Spring Boot Pagination, Sorting and Filtering

<a href="https://javatodev.com/spring-boot-pagination-sorting-and-filtering/" target="blank">
    <img align="center" src="https://javatodev.com/wp-content/uploads/2020/12/Spring-Boot-Pagination-Sorting-and-Filtering-800x450.png" 
alt="Spring Boot Pagination, Sorting and Filtering"/></a>

<p align="left">
In this article, I’m going to explain how to implement Spring Boot project with pagination enabled API plus sorting and filtering. 
Here I’m using Pageable in Spring Data Core, Spring Data JPA with MySQL based database in this practical application development and you 
can use the same with MongoDB or any other database you would like.

Technologies going to use,

- Java 1.8
- Spring Boot 2.3.4 RELEASE
- JPA
- MySQL
- Lombok
- Gradle
- IntelliJ Idea for IDE

Main topics I’m going to discuss here,

- What is Pagination, Sorting and Filtering
    - How It Works With an API ?
        - Pagination API Request
        - Pagination API Response
- Developing API Endpoints
    - Implementing Pagination and Sorting Enabled API Endpoint
        - How to Use Pageable With JpaRepository ?
        - Implementing API Endpoint to Accept Paginated Request
    - Implementing API Endpoint With Filtering
    - Testing API

</p>

📄 Original Tutorial [Spring Boot Pagination, Sorting and Filtering](https://javatodev.com/spring-boot-pagination-sorting-and-filtering/)

Related Articles

- [How to Create a Spring Boot Project](https://javatodev.com/how-to-create-a-spring-boot-project/)
- [Spring Boot REST API CRUD With DynamoDB Tutorial](https://javatodev.com/spring-boot-dynamo-db-crud-tutorial/)
- [Spring Boot REST API Using JPA, Hibernate, MySQL Tutorial](https://javatodev.com/spring-boot-mysql/)
- [Spring Boot REST API Using Spring Data MongoDB Tutorial](https://javatodev.com/spring-boot-mongodb-crud-api/)
- [Database Migration Using Flyway in Spring Boot](https://javatodev.com/flyway-spring-boot/)