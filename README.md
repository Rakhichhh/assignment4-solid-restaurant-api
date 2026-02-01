# Assignment 4 — SOLID Restaurant API

**Author:** Myrzabekov Rakhat

## Overview
This project is a Restaurant Ordering System refactored using SOLID architecture with layered structure:
controller → service → repository.

## SOLID Principles
- **SRP:** Model, repository, service, and controller have separate responsibilities.
- **OCP:** New MenuItem types can be added without modifying existing logic.
- **LSP:** FoodItem and DrinkItem correctly work as MenuItem.
- **ISP:** Small, focused interfaces are used.
- **DIP:** Service depends on CrudRepository abstraction.

## OOP Structure
- BaseEntity → MenuItem → FoodItem / DrinkItem inheritance.
- Order contains OrderItem (composition relationship).

## Advanced Features
- Generics: CrudRepository<T> and SortingUtils.
- Lambdas: Sorting menu items by price.
- Reflection: Runtime inspection of class fields and methods.
- Custom exceptions used in service layer.

## Architecture
Application flow:
Main → Controller → Service → Repository.

## Running the Project
Run `Main.java` in IntelliJ IDEA using Java 17+.

## Screenshots
Screenshots should demonstrate:
- CRUD operations
- Sorted output
- Reflection output
- Validation and error handling
