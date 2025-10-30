# ♻️ Java Design Patterns – Singleton (Nivel1)

## 📄 Description
**Exercise:**  
In this practice, we learned to **identify and implement design patterns** in Java.  
The goal was to apply the **Singleton pattern** to create a system that replicates the functionality of the `undo` or `history` command in a console.

The exercise consists of designing a class that stores user-entered commands and allows adding, removing, and listing them — all while ensuring that only **one instance** of the class exists across the entire application.

---

## ⚙️ Functionalities

**Main features implemented:**
- Add new commands to the history list.
- Undo (remove) the last entered command.
- Display all stored commands (similar to `history`).
- Prevent invalid or empty input from being added.
- Guarantee a single shared instance using the **Singleton pattern**.
- Handle invalid options or input mismatches gracefully.

**Class Responsibilities:**
1. **Undo.java**  
   - Implements the Singleton pattern.  
   - Contains methods to add, remove, and list commands.  
   - Uses an `ArrayList<String>` to store command history.

2. **Menu.java**  
   - Handles user input and displays the interactive console menu.  
   - Manages program flow and exception handling.  
   - Invokes methods from the `Undo` Singleton instance.

3. **Main.java**  
   - Entry point of the application.  
   - Initializes and starts the `Menu`.

---

## 🧪 Future Improvements / Testing Ideas
Although this exercise does not include JUnit tests, possible test cases include:
- Ensure the Singleton instance is unique across multiple calls.  
- Verify that commands are correctly added and removed.  
- Check that the command list updates accurately after each action.  
- Validate console input and error messages for invalid entries.

---

## 💻 Technologies Used
- **Java JDK 24 (OpenJDK)**  
- **IntelliJ IDEA 2025.1**  
- **Git & GitHub**  
- **Concepts:** Design Patterns (Singleton), Exception Handling, Collections, Console Interaction

---

## 📋 Requirements
- Java JDK 24+  
- IntelliJ IDEA 2025.1+  
- Git  
- Basic understanding of:
  - Object-Oriented Programming (OOP)
  - Java Collections (`ArrayList`)
  - Exception handling
  - Design Patterns (Singleton)

---

## 🛠️ Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yvangabrieli/S3.01.Patterns_1
   ```
