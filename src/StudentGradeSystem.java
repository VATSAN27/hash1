
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeSystem {
    private static final Map<String, Integer> studentGrades = new HashMap<>();

    public static void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added successfully.");
    }

    public static void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade for " + name + ": " + grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    scanner.nextLine(); // Consume newline character
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    scanner.nextLine(); // Consume newline character
                    String removeName = scanner.nextLine();
                    removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    scanner.nextLine(); // Consume newline character
                    String displayName = scanner.nextLine();
                    displayGrade(displayName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}