# VISION BANK OF INDIA

## Project Description

The Vision Bank of India app is a web-based application that simulates banking operations. A customer can apply for an account, view their balance, and make withdrawals and deposits. An employee can aprove or deny accounts and view account balances for their customers.

## Technologies Used

* JAVA - version 8
* PostgreSQL - version 13
* Hibernate - version 3.5
* Servlet - Apache Tomcat v9

## Features

List of features ready and TODOs for future development
* As a user, I can login. 
* As a customer, I can apply for a new bank account with a starting balance. 
* As a customer, I can view the balance of a specific account.
* As a customer, I can make a withdrawal or deposit to a specific account. 
* As the system, I reject invalid transactions.  Ex: A withdrawal that would result in a negative balance. A deposit or withdrawal of negative money. 
* As an employee, I can approve or reject an account. 
* As an employee, I can view a customer's bank accounts. 
* As a user, I can register for a customer account. 
* As a customer, I can post a money transfer to another account. 
* As a customer, I can accept a money transfer from another account. 
* As an employee, I can view a log of all transactions.

## Getting Started
  
Clone this Repository - git clone https://github.com/AnuradhaMishra/VisionBankOfIndia
Required Environments - Eclipse, PostgreSQL, Java 8, Servlet - Apache Tomcat v9 configured

> Make changes to username and password in hibernate.cfg.xml file located in src/main/java to match it with your postgreSQL credentials.
> Import the project after cloning in Eclipse IDE.
> Run the project on server or run the file named 'Home.html' located in src/main/webapp.
> Project is now WORKING!!!


## Usage

> You can now navigate throughout the app according to the menu showing up on the UI.
> You can't create multiple accounts with same Id.
> You can't transfer negative amount.
> You can't transfer amount greater than your account balance.

