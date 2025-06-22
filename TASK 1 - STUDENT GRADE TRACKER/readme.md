# 📘 Student Grade Tracker

A simple Java-based console application to manage and track student records and their grades. The program allows users to add students, assign grades, and display the list of all students with their respective scores and average marks.

## 🛠️ Features

- Add student name and individual subject grades.
- Automatically calculates average marks.
- Display all student data in a structured format.
- Object-Oriented Programming (OOP) design using classes and methods.

## 🧾 Class Overview

### `Student` (Model)
- **Attributes**: `name`, `grades` (ArrayList of integers)
- **Methods**:
  - `addGrade(int grade)`
  - `getAverageGrade()`
  - `getName()`
  - `getGrades()`

### `StudentGradeTracker` (Main class)
- **Handles**:
  - Menu-driven interface
  - User input
  - Managing list of students
  - Adding and displaying student records

## 🚀 How to Run

1. **Compile the Java files**  
   Ensure you have Java installed and your terminal is in the project directory.

   ```bash
   javac StudentGradeTracker.java
Run the program
java StudentGradeTracker

📂 File Structure
.
├── Student.java               # Student data model
├── StudentGradeTracker.java  # Main logic and user interaction

🖥️ Sample Output
1. Add Student
2. Add Grade to Student
3. Display All Students
4. Exit

Enter your choice: 1
Enter student name: Alice
Student added successfully.

Enter your choice: 2
Enter student name: Alice
Enter grade to add: 95
Grade added.

Enter your choice: 3
Student: Alice
Grades: [95]
Average: 95.0

📌 Requirements
Java 8 or higher

Basic terminal/command line interface

📈 Future Enhancements
GUI support using JavaFX or Swing

File-based or database storage

GPA calculation based on subject weights

Grade distribution charts

👨‍💻 Author
R. Satya Hemesh
Java Developer | OOP Projects | Console Systems
📅 Project: Student Grade Tracker - TASK 1
## 📄 License

This project is licensed under the [MIT License](LICENSE).