# Assignment 3 — Restaurant API (OOP Project)
MYRZABEKOV RAKHAT
## Description
Restaurant Management System demonstrating:
- Object-Oriented Programming principles
- Custom exceptions
- Layered architecture
- Prepared database layer (SQLite + JDBC)

## Project Structure

src/
- Main.java — entry point  
- model/ — entity classes and OOP hierarchy  
- exception/ — custom exception classes  
- repository/ — CRUD repositories (JDBC prepared)  
- service/ — business logic layer  
- utils/ — database connection utility  

## OOP Features Implemented
- Abstract base class (BaseEntity)
- Inheritance (MenuItem → FoodItem, DrinkItem)
- Interfaces (Validatable, PricedItem)
- Polymorphism
- Composition (Order → OrderItem)
- Encapsulation

## Database
SQLite schema prepared:
- menu_items
- orders
- order_items

JDBC connection implemented in:
utils/DatabaseConnection.java

## How to Run
Open project in IntelliJ IDEA and run Main.java.

