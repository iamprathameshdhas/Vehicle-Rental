# Vehicle-Rental

## Overview
Vehicle-Rental is a Spring Boot web application designed to manage car rental services efficiently. This project utilizes JPA, H2/MySQL, and follows the MVC architecture. Initially built to run on a local machine, it can be extended to support multiple machines for higher efficiency and scalability.

## Table of Contents
- [Scope of the Project & Functionalities](#scope-of-the-project--functionalities)
- [Application Workflow](#application-workflow)
- [Installation & Setup](#installation--setup)
- [Technologies Used](#technologies-used)
- [Something Missing?](#something-missing)
- [About Us](#about-us)

## Scope of the Project & Functionalities
This application provides an online platform where company members can manage their car rental services. Each user has a personal account displaying relevant information. The system supports three types of accounts:

- **Admin Accounts**: Manage users, vehicles, and rental transactions.
- **Employee Accounts**: Handle vehicle maintenance and customer interactions.
- **User Accounts**: Rent cars, view rental history, and manage personal details.

## Application Workflow
The workflow of the application follows a structured approach:
1. **User Registration & Login**: Users can sign up and log in with appropriate role-based access.
2. **Vehicle Management**: Admins and employees can add, update, or remove cars from the rental system.
3. **Booking & Renting**: Users can browse available vehicles and make rental bookings.
4. **Rental Transactions**: The system maintains records of rentals, payments, and returns.
5. **User Dashboard**: Each user can view their rental history and personal details.

For a visual representation, refer to the `workflow.drawio` diagram included in the repository.

## Installation & Setup
Follow these steps to set up and run the application locally:

### Prerequisites
- Java 17 or later
- Maven
- MySQL or H2 Database (configurable in `application.properties`)
- Spring Boot

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/vehicle-rental.git
   cd vehicle-rental
