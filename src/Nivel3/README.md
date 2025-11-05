# ♻️ Java Design Patterns – Command (Nivel3)

## 📄 Description
**Exercise:**  
In this project, we applied the **Command design pattern** to simulate a **parking system** with four vehicles — a **car**, **bicycle**, **plane**, and **boat**.  
Each vehicle can **start**, **accelerate**, and **brake** using commands that encapsulate the actions, demonstrating **decoupling between the invoker and the receiver**.

---

## ⚙️ Functionalities

**Main features implemented:**
- Execute commands (`start`, `accelerate`, `brake`) on any vehicle.  
- Separate action execution from object logic using the **Command pattern**.  
- Enable new commands or vehicle types without changing existing code.  

**Class Responsibilities:**
1. **Command.java** – Interface defining `execute()` for all actions.  
2. **Start / Accelerate / Brake Commands** – Implement actions for each vehicle.  
3. **Car / Bike / Plane / Boat** – Receivers that define real behavior.  
4. **Invoker (ParkingControl)** – Triggers the command’s execution.  
5. **Main.java** – Demonstrates how commands are created and executed.

---

## 💻 Technologies Used
- **Java JDK 24 (OpenJDK)**  
- **IntelliJ IDEA 2025.1**  
- **Git & GitHub**  
- **Concepts:** Command Pattern, OOP, Interfaces, Polymorphism

---

## 📋 Requirements
- Java JDK 24+  
- IntelliJ IDEA 2025.1+  
- Basic knowledge of:
  - Object-Oriented Programming  
  - Behavioral Design Patterns (Command)

---

## 🛠️ Installation
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yvangabrieli/S3.02.Patterns_3
```
