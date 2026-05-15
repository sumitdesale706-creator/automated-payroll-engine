🚀 Automated Payroll Engine

A high-performance, logic-driven Spring Boot microservice designed to automate corporate salary disbursements. This project handles dynamic attendance logs and calculates complex payroll components like overtime pay and tax deductions with high accuracy.

Tech Stack :
1) Backend: Java 21, Spring Boot 4.0.6

2) Database: MySQL (Manual Schema Design)

3) Architecture: Service-Repository Pattern

4) API Testing: Postman

5) Build Tool: Maven

🏗️ Architecture & Features :
1) Service-Repository Pattern:-
The project is architected to ensure system stability by decoupling the business logic from the database access layer.
 i) Controller Layer: Manages RESTful API endpoints.

 ii) Service Layer: Contains the "Engine" logic for tax (10% flat rate) and overtime calculations.

 iii) Repository Layer: Optimized database interaction using Spring Data JPA.

3) Logic-Driven Automation:-
The engine processes payroll based on the following automated logic:
 i) Overtime Pay: Overtime Hours * Hourly Rate

 ii) Gross Salary: Base Salary + Overtime Pay

 iii) Tax Deduction: Gross Salary * 10%

 iv) Net Disbursement: Gross Salary - Tax

5) Normalized Database Schema:-
Built using a manual MySQL approach to ensure data integrity:
 i)employees: Stores fixed salary and rate data.

 ii)salary_slips: Stores processed historical disbursements.


🚀 Getting Started :
Prerequisites:
JDK 21, MySQL Server, IntelliJ IDEA

Database Setup:
 1) Create a database named payroll_db.

 2) Execute the scripts found in /src/main/resources/db-scripts/schema.sql (or create tables manually for employees and salary_slips).

Configuration:
Update the src/main/resources/application.properties file:
spring.datasource.url=jdbc:mysql://localhost:3306/payroll_db
spring.datasource.username=your_username
spring.datasource.password=YOUR_PASSWORD_HERE

API Endpoints:
* Method : POST
* Endpoint : /api/payroll/run/{id}?overtimeHours=X
* Description : Triggers the engine to calculate and save a salary slip for Employee ID.

👨‍💻 Author
Sumit Desale Student at PCET's Pimpri Chinchwad College of Engineering, Pune Specialization: Java Development & System Stability
