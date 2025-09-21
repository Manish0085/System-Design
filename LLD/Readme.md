# What is LLD (Low Level Design)?

**Low Level Design (LLD)** is the detailed design of a software system that focuses on classes, methods, data structures, and database schemas.  
It explains how each module will work internally and how they will interact, serving as a direct blueprint for developers before coding.

---

## Key Factors of LLD

### 1. Scalability
The ability of the system to handle increasing workloads (more users, more data, or more transactions) without performance issues.

### 2. Maintainability
The ease with which the system can be updated, fixed, or improved in the future with minimal effort.

### 3. Reusability
The design approach that allows components, classes, or modules to be reused in different parts of the system or even in other projects.

---

## 🚖 Example: Ride Booking System (LLD)

- Suppose we are designing a Ride Booking System.

- Classes:
  - User (fields: userId, name, phone)
  - Driver (fields: driverId, name, vehicleDetails)
  - Ride (fields: rideId, pickupLocation, dropLocation, fare)

- Methods:
  - User.requestRide()
  - Driver.acceptRide()
  - Ride.calculateFare()
  - Ride.startRide() / Ride.endRide()

- Database Tables:
  - users, drivers, rides

---


## HLD (High Level Design)
- **System Architecture**  
  HLD gives the overall view of the system. It explains what the system will do, its modules, external interfaces, and how different components connect at a high level.  
  👉 Example: In a ride booking app, HLD shows modules like User Service, Driver Service, Payment Service, and how they interact.

## LLD (Low Level Design)
- **Code Architecture**  
  LLD provides the detailed design of each module. It focuses on classes, methods, database tables, and the interaction between them. It acts as a blueprint for developers to start coding.  
  👉 Example: In a ride booking app, LLD defines classes like `User`, `Driver`, `Ride`, their fields, and methods like `requestRide()` or `calculateFare()`.

## DSA (Data Structures & Algorithms)
- **Tool**  
  DSA represents the building blocks and techniques used to solve problems efficiently. Data structures store and organize data, while algorithms provide step-by-step solutions to perform tasks.  
  👉 Example: Using a graph algorithm to find the shortest route in a ride booking app.

---

**Note:** If DSA is the brain of an application, then LLD is the skeleton.







