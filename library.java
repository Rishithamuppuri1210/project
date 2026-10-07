import java.util.*;

class Book {
    int id;
    String name;
    String author;
    boolean available = true;
    int memberId;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

class Member {
    int id;
    String name;

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Member> members = new ArrayList<>();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Member");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Author: ");
                String author = sc.nextLine();

                books.add(new Book(id, name, author));

                System.out.println("Book Added Successfully!");

            } else if (choice == 2) {

                System.out.println("\n--- Book Inventory ---");

                for (Book b : books) {
                    System.out.println("Book ID: " + b.id);
                    System.out.println("Book Name: " + b.name);
                    System.out.println("Author: " + b.author);
                    System.out.println("Available: " + b.available);
                    System.out.println();
                }

            } else if (choice == 3) {

                System.out.print("Enter Member ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Member Name: ");
                String name = sc.nextLine();

                members.add(new Member(id, name));

                System.out.println("Member Added Successfully!");

            } else if (choice == 4) {

                System.out.print("Enter Book ID: ");
                int bookId = sc.nextInt();

                System.out.print("Enter Member ID: ");
                int memberId = sc.nextInt();

                for (Book b : books) {
                    if (b.id == bookId && b.available) {
                        b.available = false;
                        b.memberId = memberId;
                        System.out.println("Book Issued Successfully!");
                    }
                }

            } else if (choice == 5) {

                System.out.print("Enter Book ID: ");
                int bookId = sc.nextInt();

                System.out.print("Enter overdue days: ");
                int days = sc.nextInt();

                for (Book b : books) {
                    if (b.id == bookId && !b.available) {

                        b.available = true;
                        b.memberId = 0;

                        int fine = days * 5;

                        System.out.println("Book Returned Successfully!");
                        System.out.println("Overdue Fine: Rs." + fine);
                    }
                }

            } else if (choice == 6) {

                System.out.println("Thank you!");
                break;

            } else {

                System.out.println("Invalid choice!");
            }
        }
    }
}