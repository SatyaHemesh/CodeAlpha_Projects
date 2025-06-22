# 🏨 Hotel Reservation System

A simple **Java-based console application** that simulates a hotel reservation system using **Object-Oriented Programming (OOP)** and **JSON file storage** (via Gson). Users can view available rooms, book or cancel reservations, and simulate payments.

---

## ✅ Features

- View available rooms by type (Standard, Deluxe, Suite)
- Book a room with check-in and check-out dates
- Cancel an existing reservation
- Simulate payment and confirmation
- Save/load booking data using JSON file
- Clean OOP design (Room, User, Reservation, Hotel, Utils classes)

---

## 🛠 Technologies Used

- Java 8+ (Object-Oriented Design)
- Gson (Google JSON library for file I/O)
- Console-based interaction

---

## 📂 Project Structure

HotelReservationSystem/
├── Room.java
├── Reservation.java
├── User.java
├── Hotel.java
├── Utils.java
├── HotelSystem.java # Main Class
├── gson-2.10.1.jar # External JSON library
└── booking.json # Saved booking data (auto-generated)

---

## 🚀 How to Run

### 🧱 Prerequisites

- Java JDK 8 or higher
- Gson Library (`gson-2.10.1.jar`)  
  👉 [Download here](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar)

### 🔧 Compile the project

> Open terminal inside the project folder:

```bash
javac -cp ".;gson-2.10.1.jar" *.java   # Use ':' instead of ';' on Mac/Linux
java -cp ".;gson-2.10.1.jar" HotelSystem


--- HOTEL MENU ---
1. View Available Rooms
2. Book a Room
3. Cancel Reservation
4. View My Bookings
5. Exit

Example - Booking.json
{
  "name": "Satya Hemesh",
  "reservations": [
    {
      "roomId": 101,
      "customerName": "Satya Hemesh",
      "checkInDate": "2025-06-22",
      "checkOutDate": "2025-06-23",
      "totalAmount": 200.0
    }
  ]
}

📌 Future Enhancements
Integrate SQLite or MySQL database

Add login functionality with multiple users

Support for date difference-based billing

Implement GUI using JavaFX or Swing

Email or SMS confirmation simulation

👨‍💻 Author
R.Satya Hemesh
Java Developer | OOP Projects | Console Systems
📅 Project: Hotel Booking System - TASK 3

📄 License
This project is licensed for educational/demo use.
