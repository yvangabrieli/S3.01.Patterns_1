# ♻️ Java Design Patterns – Abstract Factory (Nivel2)

## 📄 Description
**Exercise:**  
In this practice, we learned to **identify and implement design patterns** in Java.  
The goal was to apply the **Abstract Factory pattern** to create an **international contact manager** that handles addresses and phone numbers from different countries.

The program allows adding **country-specific contacts** (France, Italy, Spain) using dedicated factories for each format while keeping the main code independent of the concrete implementations.

---

## ⚙️ Functionalities

**Main features implemented:**
- Add and display **international contacts** (address and phone number).  
- Support for multiple countries (**France**, **Italy**, **Spain**).  
- Generate country-specific objects using the **Abstract Factory pattern**.  
- Validate address and phone number formats per country.  
- Ensure scalability for adding new regions without modifying core logic.

**Class Responsibilities:**
1. **ContactFactory.java**  
   - Defines abstract methods for creating `Address` and `PhoneNumber` objects.

2. **FactoryFrance / FactoryItaly / FactorySpain.java**  
   - Concrete factories that generate localized address and phone number formats.

3. **AddressFrance / AddressItaly / AddressSpain.java**  
   - Implement the `Address` interface with country-specific formatting and validation.

4. **PhoneNumberFrance / PhoneNumberItaly / PhoneNumberSpain.java**  
   - Implement the `PhoneNumber` interface for each country format.

5. **Contacts.java**  
   - Represents a contact composed of an address and phone number.

6. **Main.java**  
   - Entry point that demonstrates how each factory creates country-specific contacts.

---

## 🧪 Future Improvements / Testing Ideas
Although this exercise does not include JUnit tests, possible test cases include:
- Validate correct address and phone formats per country.  
- Ensure new countries can be added without modifying existing factories.  
- Verify that invalid inputs throw exceptions.  
- Confirm that the contact list displays properly formatted output.

---

## 💻 Technologies Used
- **Java JDK 24 (OpenJDK)**  
- **IntelliJ IDEA 2025.1**  
- **Git & GitHub**  
- **Concepts:** Design Patterns (Abstract Factory), OOP, Exception Handling, Collections

---

## 📋 Requirements
- Java JDK 24+  
- IntelliJ IDEA 2025.1+  
- Git  
- Basic understanding of:
  - Object-Oriented Programming (OOP)
  - Interfaces & Abstract Classes  
  - Design Patterns (Abstract Factory)
  - Exception handling

---

## 🛠️ Installation

1. **Clone the repository:**
   ```bash
https://github.com/yvangabrieli/S3.01.Patterns_1/new/main/src/Nivel2
```
