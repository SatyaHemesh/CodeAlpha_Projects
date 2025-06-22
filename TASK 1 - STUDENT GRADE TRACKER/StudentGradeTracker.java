import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    ArrayList<Integer> grades;

    Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    void addGrade(int grade) {
        grades.add(grade);
    }

    double getAverage() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.size();
    }

    int getHighest() {
        int max = Integer.MIN_VALUE;
        for (int g : grades) {
            if (g > max) max = g;
        }
        return max;
    }

    int getLowest() {
        int min = Integer.MAX_VALUE;
        for (int g : grades) {
            if (g < min) min = g;
        }
        return min;
    }

    void displayReport() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.printf("Average: %.2f\n", getAverage());
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
        System.out.println("----------------------------------");
    }
}

public class StudentGradeTracker {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("🎓 Welcome to Student Grade Tracker");

        boolean running = true;
        while (running) {
            System.out.println("\n📋 Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grades");
            System.out.println("3. Show Reports");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addGrades();
                    break;
                case 3:
                    showReports();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid option ❌");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        students.add(new Student(name));
        System.out.println("✅ Student added.");
    }

    static void addGrades() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students available. Add a student first.");
            return;
        }

        System.out.println("Select student:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i).name);
        }
        int choice = sc.nextInt();
        if (choice < 1 || choice > students.size()) {
            System.out.println("Invalid student.");
            return;
        }

        Student student = students.get(choice - 1);
        System.out.print("Enter number of grades to add: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            int grade = sc.nextInt();
            student.addGrade(grade);
        }
        System.out.println("✅ Grades added.");
    }

    static void showReports() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No student data to show.");
            return;
        }

        System.out.println("\n📊 Student Grade Summary Report");
        System.out.println("----------------------------------");
        for (Student s : students) {
            s.displayReport();
        }
    }
}
