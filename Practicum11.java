import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Practicum11 {

    static Hashtable<Integer, String> books = new Hashtable<>();
    static Scanner sc = new Scanner(System.in);

    // Add a new book
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String bookTitle = sc.nextLine();

        if (books.containsKey(bookId)) {
            System.out.println("Book ID already exists.");
        } else {
            books.put(bookId, bookTitle);
            System.out.println("Book added successfully.");
        }
    }

    // Search for a book
    static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        if (books.containsKey(bookId)) {
            String title = books.get(bookId);

            System.out.println("Book found.");
            System.out.println("Book ID    : " + bookId);
            System.out.println("Book Title : " + title);
        } else {
            System.out.println("Book not found.");
        }
    }

    // Remove a book
    static void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found. Unable to remove.");
        }
    }

    // Display all books
    static void displayAllBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n===== Available Books =====");

        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            System.out.println(
                    "Book ID: " + entry.getKey()
                    + " | Book Title: " + entry.getValue()
            );
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Book Lookup System =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Search a Book");
            System.out.println("3. Remove a Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    searchBook();
                    break;

                case 3:
                    removeBook();
                    break;

                case 4:
                    displayAllBooks();
                    break;

                case 5:
                    System.out.println("Exiting Book Lookup System.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please select a valid option."
                    );
            }

        } while (choice != 5);

        sc.close();
    }
}


Program Output:

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class BookLookupSystem {

    static Hashtable<Integer, String> books = new Hashtable<>();
    static Scanner sc = new Scanner(System.in);

    // Add a new book
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String bookTitle = sc.nextLine();

        if (books.containsKey(bookId)) {
            System.out.println("Book ID already exists.");
        } else {
            books.put(bookId, bookTitle);
            System.out.println("Book added successfully.");
        }
    }

    // Search for a book
    static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        if (books.containsKey(bookId)) {
            String title = books.get(bookId);

            System.out.println("Book found.");
            System.out.println("Book ID    : " + bookId);
            System.out.println("Book Title : " + title);
        } else {
            System.out.println("Book not found.");
        }
    }

    // Remove a book
    static void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found. Unable to remove.");
        }
    }

    // Display all books
    static void displayAllBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n===== Available Books =====");

        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            System.out.println(
                    "Book ID: " + entry.getKey()
                    + " | Book Title: " + entry.getValue()
            );
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Book Lookup System =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Search a Book");
            System.out.println("3. Remove a Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    searchBook();
                    break;

                case 3:
                    removeBook();
                    break;

                case 4:
                    displayAllBooks();
                    break;

                case 5:
                    System.out.println("Exiting Book Lookup System.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please select a valid option."
                    );
            }

        } while (choice != 5);

        sc.close();
    }
}
