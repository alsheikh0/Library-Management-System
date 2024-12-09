import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Library library = new Library();
        while (true) {
            System.out.println("Welcome to Library Management System");
            System.out.println("Enter your choice");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. Print All Customers");
            System.out.println("4. Add Book");
            System.out.println("5. Remove Book");
            System.out.println("6. Print All Books");
            System.out.println("7. Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Name");
                    String name = scanner.next();
                    System.out.println("Enter Customer Email");
                    String email = scanner.next();
                    System.out.println("Enter Customer Age");
                    int age = scanner.nextInt();
                    library.addCustomer(new Customer(name, email, age, 8666));
                    System.out.println("Customer Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter Customer Id");
                    int customerId = scanner.nextInt();
                    library.removeCustomer(customerId);
                    break;
                case 3:
                    System.out.println("Printing All Customers");
                    library.printAllCustomers();
                    break;
                case 4:
                    System.out.println("Enter Book Title");
                    String title = scanner.next();
                    System.out.println("Enter Book Author");
                    String author = scanner.next();
                    System.out.println("Enter Book Year");
                    int year = scanner.nextInt();
                    library.addBook(new Book(title, author, year));
                    break;
                case 5:
                    System.out.println("Enter Book Id");
                    int bookId = scanner.nextInt();
                    library.removeBook(bookId);
                case 6:
                    System.out.println("Printing All Books");
                    library.printAllBooks();
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }}