import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    String department;
    int semester;

    Student(int studentId, String studentName, String department, int semester) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.semester = semester;
    }

    void displayStudent() {
        System.out.println("Student ID      : " + studentId);
        System.out.println("Student Name    : " + studentName);
        System.out.println("Department      : " + department);
        System.out.println("Semester        : " + semester);
        System.out.println("-----------------------------");
    }
}

public class Practicum10 {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.studentId == id) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();
        sc.nextLine();

        Student student = new Student(id, name, department, semester);
        students.add(student);

        System.out.println("Student record added successfully.");
    }

    static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student studentToRemove = null;

        for (Student s : students) {
            if (s.studentId == id) {
                studentToRemove = s;
                break;
            }
        }

        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student record removed successfully.");
        } else {
            System.out.println("Student record not found.");
        }
    }

    static void searchStudent() {
        System.out.println("1. Search by Student ID");
        System.out.println("2. Search by Student Name");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        if (choice == 1) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            for (Student s : students) {
                if (s.studentId == id) {
                    s.displayStudent();
                    found = true;
                    break;
                }
            }

        } else if (choice == 2) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            for (Student s : students) {
                if (s.studentName.equalsIgnoreCase(name)) {
                    s.displayStudent();
                    found = true;
                }
            }

        } else {
            System.out.println("Invalid search choice.");
            return;
        }

        if (!found) {
            System.out.println("Student record not found.");
        }
    }

    static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\nStudent Records");
        System.out.println("=============================");

        for (Student s : students) {
            s.displayStudent();
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    removeStudent();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    displayAllStudents();
                    break;

                case 5:
                    System.out.println(
                            "Exiting Student Record Management System."
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }

        } while (choice != 5);

        sc.close();
    }
}
