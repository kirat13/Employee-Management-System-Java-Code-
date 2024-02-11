
# Employee Management System

This is a simple Employee Management System implemented in Java using CRUD (Create, Read, Update, Delete) operations. It utilizes AWT and Swing for the graphical user interface, JDBC for database connectivity, and SQL queries for database operations. With this system, you can easily manage employee details by adding, viewing, updating, and deleting them.


## Features

#### ✅Add Employee: Add new employees to the system by providing their details such as name, designation, salary, etc.

#### ✅View Employee Details: View the details of all employees currently in the system.

#### ✅Update Employee Details: Modify the details of existing employees as needed.

#### ✅Delete Employee: Remove employees from the system if they are no longer active or relevant.


## Requirements

#### 📌Java Development Kit (JDK)
#### 📌Any IDE (Integrated Development Environment) like Eclipse, IntelliJ IDEA, or NetBeans
#### 📌MySQL database server
## Setup

1. Clone this repository to your local machine.
2. Import the project into your preferred IDE.
3. Set up a MySQL database with the following schema:

CREATE DATABASE employeemanagementsystem;

USE employeemanagementsystem;
#### Create Employee details
create table employee(name varchar(20),
fname varchar(20),
dob varchar(20),
salary varchar(20),
 address varchar(20),
  phone varchar(20),
   email varchar(20),
   education varchar(20),
   designation varchar(20), adhar varchar(20),empId varchar(20));

#### create Login table 

create table login(username varchar(10), password varchar(10));

4. Configure your database connection in the DBConnection.java file to match your MySQL credentials.
5. Compile and run the application.

## Demo
https://github.com/kirat13/Employee-Management-System-Java-Code-/assets/152523419/a07c8de3-9f77-4709-af68-d2d92f990abe

## Usage
1. Launch the application.
2. Use the provided interface to perform CRUD operations on employee details.
3. Click on the corresponding buttons (Add, View, Update, Delete) to perform the desired action.
4. Follow the on-screen instructions to input or modify employee details.
5. Close the application when done.






