Vehicle-Rental

Overview

Vehicle-Rental is a Spring Boot web application designed to manage car rental services efficiently. This project utilizes JPA, H2/MySQL, and follows the MVC architecture. Initially built to run on a local machine, it can be extended to support multiple machines for higher efficiency and scalability.

Table of Contents

Scope of the Project & Functionalities

Application Workflow

Installation & Setup

Technologies Used

Something Missing?

About Us

Scope of the Project & Functionalities

This application provides an online platform where company members can manage their car rental services. Each user has a personal account displaying relevant information. The system supports three types of accounts:

Admin Accounts: Manage users, vehicles, and rental transactions.

Employee Accounts: Handle vehicle maintenance and customer interactions.

User Accounts: Rent cars, view rental history, and manage personal details.

Application Workflow

The workflow of the application follows a structured approach:

User Registration & Login: Users can sign up and log in with appropriate role-based access.

Vehicle Management: Admins and employees can add, update, or remove cars from the rental system.

Booking & Renting: Users can browse available vehicles and make rental bookings.

Rental Transactions: The system maintains records of rentals, payments, and returns.

User Dashboard: Each user can view their rental history and personal details.

For a visual representation, refer to the workflow.drawio diagram included in the repository.

Installation & Setup

Follow these steps to set up and run the application locally:

Prerequisites

Java 17 or later

Maven

MySQL or H2 Database (configurable in application.properties)

Spring Boot

Steps

Clone the repository:

git clone https://github.com/yourusername/vehicle-rental.git
cd vehicle-rental

Configure the database settings in src/main/resources/application.properties.

Build and run the application using Maven:

mvn spring-boot:run

Access the application at http://localhost:8080.

Technologies Used

Spring Boot (MVC, JPA, Security)

H2 / MySQL (Database Management)

Thymeleaf / React (Frontend, if applicable)

Lombok (Simplified Java code)

Spring Security (Authentication & Authorization)

Something Missing?

If you find any missing features or bugs, feel free to open an issue or contribute via a pull request!

About Us

This project was developed to practice Spring Boot concepts and build a scalable car rental management system. Contributions are welcome!

Note: This project is currently configured for local execution but can be modified for deployment on multiple machines.
