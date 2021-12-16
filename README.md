# Taxi service

That application main purpose is to efficiently and simple manage company, which provides taxi services.
An application was designed as easy-to-use and maintain solution, so it shouldn't be a problem to add more features.

That goal was achieved by following N-Tier architecture, SOLID principles and dependency injection (DI in future) technique. 

An application has three tiers: DAO, Service and Controller and obvious DI representation is Injector and SOLID principles are used in class design.   

### Functionality that is implemented

- creating drivers, manufacturers of cars and cars themselves.
- adding multiple drivers and manufacturer to car 
- adding multiple cars to driver
- authentication and registration system, where only registered users (drivers in our case) can utilize the application
- display info about cars, drivers and manufacturers
- ability to delete cars, drivers and manufacturers 

### Technologies that was used

- JDBC
- MySQL
- Servlet
- JSP and JSTL

### How to run project

- Java 11.0.12 version recommended
- Tomcat 9.0.50 must be installed and configured
- MySQL 8.0.27 and it's workbench must be installed
- Input schema from "main/resources/init_db.sql" to MySQL workbench to configure DB
- Configure ConnectionUtil class which stored in "src/main/java/taxi/util/ConnectionUtil"
- Run project

###### To properly use it, you need to authenticate or register.