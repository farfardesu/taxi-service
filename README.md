# Taxi service

That application main purpose is to simple manage company, which provides taxi services.
An application was designed as easy-to-use and maintain solution, so it shouldn't be a problem to add more features.

That goal was achieved by following N-Tier architecture, SOLID principles and dependency injection technique. 

An application has three tiers: DAO, Service and Controller and obvious DI representation is Injector and SOLID principles are used in class design.   

### Implemented functionality

- creating drivers, manufacturers of cars and cars themselves.
- adding multiple drivers and manufacturer to car 
- adding multiple cars to driver
- authentication and registration system, where only registered users (drivers in our case) can utilize the application
- display info about cars, drivers and manufacturers
- ability to delete cars, drivers and manufacturers 

### Technologies

- Java 11
- tomcat 9.0.50
- JDBC
- MySQL
- Servlet
- JSP
- JSTL

### How to run project

1. Java 11.0.12 version recommended
2. Tomcat 9.0.50 must be installed and configured
3. MySQL 8.0.27 and it's workbench must be installed
4. Use "main/resources/init_db.sql" in MySQL workbench to configure schema
5. Configure ConnectionUtil class which stored in "src/main/java/taxi/util/ConnectionUtil"
6. Run project

###### To properly use it, you need to authenticate or register.
