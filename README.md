This project simulates basic bank operations such as deposit, withdrawal, balance inquiry, and transaction history tracking.
It is built using Java Object-Oriented Programming concepts such as Classes, Inheritance, Method Overriding, and Encapsulation.

# Features
Create an account with an initial balance--
Deposit money (with interest for savings account)---
Withdraw money (with balance checks)---
View current balance--
View full transaction history--
Demonstrates OOP principles in Java--

# Technologies Used

Java 17+
SpringToolSuite
# Project Structure
BankSimulation.java        → Main class with menu-driven operations
Account.java               → Base Account class with common banking methods
SavingsAccount.java        → Inherited class with overridden deposit method

# How It Works

Account Creation – User enters name and initial balance---
Deposit – Adds money to the account and applies interest for savings accounts---
Withdraw – Deducts money if sufficient balance exists---
Transaction History – Stores all deposits, withdrawals, and interest addition
# Concepts Covered

Classes & Objects ,
Inheritance ,
Method Overriding ,
Encapsulation ,
Polymorphism ,
Transaction tracking with Lists
# Example Output
Enter the AccountHolder Name
Ganesh
Enter the Depositing amount
6000

--------------Bank Menu LIST----------
|   1 Deposi Amoount   |
|   2 Withdraw Amount  |
|   3 Show Balance     |
|   4 Show Transectiones |
|   5 Exit |
-----   Enter the choice ---------
1
Enter the deposit ammount
1345
Amount deposited successfully! Current Balance: 7345.0
