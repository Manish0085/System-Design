# 🚀 SOLID Principles

## ❌ Problems Without SOLID

### 1. Poor **Maintainability**
- **Without SOLID**: When one class handles too many responsibilities, a small change in one feature can break other unrelated features.
- **With SOLID**: Each class has a single responsibility (SRP), so changes are isolated and easy to manage.

---

### 2. Low **Readability**
- **Without SOLID**: Code becomes messy, tightly coupled, and hard to understand for new developers.
- **With SOLID**: Code is modular, follows clear contracts (interfaces/abstractions), and is self-explanatory.

---

### 3. Higher Chances of **Bugs**
- **Without SOLID**: Modifying existing code for new features introduces regressions because multiple functionalities are tangled together.
- **With SOLID**: Code is closed for modification but open for extension (OCP), so you add new features without touching tested code.

---

### 4. Difficult to **Scale and Extend**
- **Without SOLID**: Adding new functionality means rewriting old code → risky, time-consuming, error-prone.
- **With SOLID**: You can extend the system easily using abstractions, polymorphism, and dependency inversion (DIP), keeping the system scalable.

---

## ✅ What is SOLID?
SOLID is an acronym for **five design principles** that help in creating **clean, maintainable, and scalable** software:

1. **S** – Single Responsibility Principle (SRP)
2. **O** – Open/Closed Principle (OCP)
3. **L** – Liskov Substitution Principle (LSP)
4. **I** – Interface Segregation Principle (ISP)
5. **D** – Dependency Inversion Principle (DIP)

---

## 1. 🟢 Single Responsibility Principle (SRP)
- **Definition**: A class should have only **one reason to change**.
- Each class should focus on **a single task** or responsibility.
- 👉 Promotes **separation of concerns**.

**Example:**  
❌ A `User` class that handles **user data + sending email notifications**.  
✅ Split into `User` (data handling) and `EmailService` (notifications).

---

## 2. 🟢 Open/Closed Principle (OCP)
- **Definition**: Classes should be **open for extension** but **closed for modification**.
- Add new functionality by extending existing code, **without changing it**.
- 👉 Promotes **flexibility & reusability**.

**Example:**
- Payment system supports `CreditCardPayment`.
- Adding `UpiPayment` or `PayPalPayment` should not require changes in `PaymentProcessor`.

---

## 3. 🟢 Liskov Substitution Principle (LSP)
- **Definition**: Subclasses should be **substitutable** for their base classes.
- Objects of a superclass should be replaceable with objects of a subclass **without breaking behavior**.
- 👉 Ensures **polymorphism works correctly**.

**Example:**
- A `Bird` base class has `fly()`.
- `Sparrow` (can fly ✅) is fine, but `Penguin` (cannot fly ❌) breaks LSP.
- Solution → use better abstraction (`FlyingBird`, `NonFlyingBird`).

---

## 4. 🟢 Interface Segregation Principle (ISP)
- **Definition**: No client should be forced to depend on **methods it doesn’t use**.
- Instead of one large interface, create **multiple small, specific interfaces**.
- 👉 Promotes **loose coupling**.

**Example:**  
❌ `IMachine` with `print(), scan(), fax()`.
- A `Printer` class doesn’t need `scan()` or `fax()`.  
  ✅ Split into `IPrinter`, `IScanner`, `IFax`.

---

## 5. 🟢 Dependency Inversion Principle (DIP)
- **Definition**: Depend on **abstractions**, not on concrete implementations.
- High-level modules should not depend on low-level modules → both should depend on abstractions.
- 👉 Promotes **flexibility & testability**.

**Example:**  
❌ `PaymentProcessor` directly depends on `CreditCardPayment`.  
✅ `PaymentProcessor` depends on `Payment` interface → allows `UPI`, `PayPal`, etc.

---

## 🎯 Benefits of SOLID
- Cleaner, maintainable code
- Easy to test and extend
- Reduces bugs
- Improves scalability  
