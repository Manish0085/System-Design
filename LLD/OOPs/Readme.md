# History of Programming

Programming has evolved step by step, starting from very basic instructions for machines to advanced concepts like Object-Oriented Programming (OOPs).

---

## 1. Machine Language (1st Generation)
- Written in **binary (0s and 1s)**.
- Very hard for humans to read and write.
- Directly understood by the computer hardware.  
  👉 Example: `10110000 01100001`

---

## 2. Assembly Language (2nd Generation)
- Used **mnemonics (short codes)** instead of binary.
- Easier for humans but still close to hardware.
- Needed an **assembler** to convert into machine code.  
  👉 Example: `MOV A, 5`

---

## 3. High-Level Languages (3rd Generation)
- More human-friendly, closer to English.
- Portable across machines.
- Needed a **compiler or interpreter**.
- Examples: **C, FORTRAN, COBOL, BASIC**  
  👉 Example in C:
  ```c
  printf("Hello World");
  ```
---

## 4. Structured Programming

- Introduced the idea of breaking programs into functions and procedures.
- Made programs easier to read, debug, and maintain.
  👉 Example Languages: C, Pascal

 ---

## 5. Object-Oriented Programming (OOPs)

- Focuses on objects that combine data (fields) and behavior (methods).
- Supports concepts like Encapsulation, Inheritance, Polymorphism, and Abstraction.
- Makes software modular, reusable, and easier to scale.
  👉 Example Languages: C++, Java, Python (supports OOP)

```java
class Car {
    void drive() {
        System.out.println("Car is driving");
    }
}

```

---

# Four Pillars of OOPs

Object-Oriented Programming (OOPs) is based on **four main principles** that make programs modular, reusable, and easy to maintain.

---

## 1. Encapsulation
- **Definition:** The process of wrapping data (variables) and methods (functions) into a single unit called a **class**.
- **Purpose:** Protects data from unauthorized access and hides internal implementation details.
- **Example:**
```java
  class BankAccount {
      private double balance; // data is hidden

      public void deposit(double amount) {
          balance += amount;
      }

      public double getBalance() {
          return balance;
      }
  }
```

---

## 2. Abstraction
- **Definition:** Hiding the complex implementation and showing only the essential features to the user.
- **Purpose:** Reduces complexity and allows focusing on what an object does, not how it does it.
- **Example:**
```java
  abstract class Vehicle {
      abstract void start();
  }
  
  class Car extends Vehicle {
      void start() {
          System.out.println("Car is starting");
      }
  }

```

---

## 3. Inheritance
- **Definition:** The ability of one class (child/subclass) to acquire the properties and behavior of another class (parent/superclass).
- **Purpose:** Promotes code reusability and hierarchical classification.
- **Example:**
```java
  class Animal {
    void eat() {
      System.out.println("Eating");
    }
  }
  
  class Dog extends Animal {
    void bark() {
      System.out.println("Barking");
    }
  }

```

---

### 4. Polymorphism
- **Definition:** The ability of an object to take many forms.
- **Purpose:** Allows one interface to be used for multiple implementations.
- **Example:**
```java
  class Bird {
      void sound() {
          System.out.println("Some sound");
      }
  }
  
  class Sparrow extends Bird {
      void sound() {
          System.out.println("Chirp Chirp");
      }
  }

```
---

## Summary:

- Encapsulation: Hides data
- Abstraction: Hides complexity
- Inheritance: Reuse code
- Polymorphism: Multiple forms


---


## Four Pillars of OOPs - Visual Diagram
```
                 +----------------+
                 |  OOPs Concept  |
                 +----------------+
                          |
       -----------------------------------------------------------
       |                  |                    |                 |
+----------------+ +----------------+ +----------------+ +----------------+
| Encapsulation  | | Abstraction    | | Inheritance    | | Polymorphism   |
+----------------+ +----------------+ +----------------+ +----------------+
| Hides data     | | Hides          | | Reuses code    | | Many forms of  |
| and logic      | | complexity     | |                | | objects        |
+----------------+ +----------------+ +----------------+ +----------------+
```