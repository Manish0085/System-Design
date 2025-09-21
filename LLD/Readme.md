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









