# 📈 Stock Trading Platform (Java)

A Java-based **console application** that simulates a basic stock trading environment. It allows users to view market prices, buy/sell stocks, and track their portfolio performance over time using **Object-Oriented Programming (OOP)** and **file-based JSON persistence**.

---

## ✅ Features

- View live-updating market data (simulated price changes)
- Buy and sell stocks based on current market price
- Track user portfolio including balance and holdings
- Save and load portfolio using JSON files
- Uses clean and modular OOP design (`Stock`, `Market`, `User`, `Transaction`, etc.)

---

## 🛠 Technologies Used

- Java 8+ (Object-Oriented Programming)
- Gson (Google’s JSON library)
- Console-based user interface
- File I/O using JSON

---

## 📂 Project Structure

StockTradingPlatform/
├── Stock.java # Represents a stock with price updates
├── Market.java # Simulates and manages all stock data
├── User.java # Holds portfolio and transaction logic
├── Utils.java # File I/O helper using Gson
├── TradingPlatform.java # Main class with user interaction
├── gson-2.10.1.jar # External library for JSON
└── portfolio.json # Auto-generated user portfolio

---

## 🚀 How to Run

### 🧱 Prerequisites

- Java JDK 8 or higher
- Gson Library  
  👉 [Download gson-2.10.1.jar](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar)

---

### 🔧 Compile the project

```bash
javac -cp ".;gson-2.10.1.jar" *.java   # Windows  
javac -cp ".:gson-2.10.1.jar" *.java   # Mac/Linux

▶️ Run the project
java -cp ".;gson-2.10.1.jar" TradingPlatform   # Windows  
java -cp ".:gson-2.10.1.jar" TradingPlatform   # Mac/Linux

💻 Sample Menu
Market Prices:
AAPL - Apple Inc.: $175.52
GOOG - Alphabet Inc.: $2899.77
TSLA - Tesla Inc.: $739.11

Options: 
1) Buy  
2) Sell  
3) Save  
4) Exit
Choose an action: 

📝 Example portfolio.json
{
  "name": "Satya Hemesh",
  "balance": 9575.0,
  "portfolio": 
  {
    "AAPL": 1,
    "TSLA": 2
  }
}

📌 Future Enhancements
Add real-time stock data using APIs

Add login support for multiple users

Implement transaction history tracking

Create a JavaFX GUI for user interaction

Support for dividends, taxes, and stock splits

👨‍💻 Author
R.Satya Hemesh
Java Developer | OOP Projects | Console Systems
📅 Project: Stock Trading Platform - TASK 2


---
📄 License
This project is intended for academic and demonstration purposes.
