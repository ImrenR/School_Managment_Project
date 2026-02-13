# School_Managment_Project

# School Management Project

## Overview
This is a **Java console application** for managing **students and teachers** in a school system.  
It allows the user to **add, search, list, and delete** students and teachers through a **menu-driven interface**.

The project demonstrates **object-oriented programming (OOP) concepts** including:
- Inheritance
- Encapsulation
- Polymorphism

---

## Architecture

Here is a simple architecture diagram of the project:

![School Management Architecture](src/OkulYönetimi.jpg)

- `Person` → Base class for students and teachers
- `Student` → Extends `Person`
- `Teacher` → Extends `Person`
- `School_Managment` → Handles menus and CRUD operations
- `Actions` → Entry menu and application flow
- `Runner` → Program entry point

---

## Project Structure

| Class | Description |
|-------|-------------|
| `Person` | Base class (`nameSurname`, `age`, `id`) |
| `Student` | Extends `Person`, adds `studentNo` and `classs` |
| `Teacher` | Extends `Person`, adds `sicilNo` and `bolum` |
| `School_Managment` | Menus and operations (add, search, list, delete) |
| `Actions` | Main menu and user interaction logic |
| `Runner` | Entry point (`main` method) |

---

## Features

- Add new students or teachers
- Search students or teachers by ID
- List all students or teachers
- Delete students or teachers by ID
- Console-based menu-driven navigation

---

## Usage

1. Open the project in IntelliJ IDEA.
2. Run the `Runner` class to start the program.
3. Follow the main menu instructions to manage students and teachers.

---

## Example

Adding a Student:
 -  Enter a name and surname for Student: John Doe
 -  Enter a id for Student: 101
  - Enter an age for Student: 20
 -  Enter a student number for Student: 12345
  - Enter a class name for Student: A1
 -  The student John Doe has been added successfully!

---

## Notes

- Only **one Scanner instance** is used to handle all input.
- `nextLine()` is used for all inputs to avoid skipping issues after `nextInt()`. (dumy)
- Recursive calls inside loops are avoided for search and delete operations.
- `Person` is the base class, and `Student`/`Teacher` extend it.

---

## License
This project is for **educational purposes** and personal use.
