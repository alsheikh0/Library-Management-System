import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations {
    List<Book> books = new ArrayList<Book>();
    List<Customer> customers = new ArrayList<Customer>();

    @Override
    public void addBook(Book book) {
        System.out.println("Adding Book...");
        try{
            books.add(book);
        } catch(Exception e){
            System.out.println("Error Adding Book");
    }
        System.out.println("Book added successfully");}

    @Override
    public void removeBook(int bookId) {
        System.out.println("Removing Book...");
        try {
            books.stream().filter( book -> {return book.getBookId() == bookId;}).forEach(book -> {books.remove(book);});
        } catch(Exception e) {
            System.out.println("Error removing book");
        }
        System.out.println("Book removed successfully");

    }

    @Override
    public void printAllBooks() {
        System.out.println("Printing all books");
        books.forEach(book -> {System.out.println(book.toString());});

    }

    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Adding Customer...");
        try{
            customers.add(customer);
        } catch(Exception e) {
            System.out.println("Error adding customer");
        }

    }

    @Override
    public void removeCustomer(int customerId) {
        System.out.println("Removing customer...");
        try{
            customers.stream().filter( customer -> {  return customer.getCustomerId() == customerId;})
                    .forEach( customer -> {customers.remove(customer);});
        } catch(Exception e) {
            System.out.println("Error removing customer");
        }
        System.out.println("Customer removed successfully");
    }

    @Override
    public void printAllCustomers() {
        try{
            System.out.println("Printing all customers");
            customers.forEach( customer -> {System.out.println(customer.toString());});

        } catch(Exception e) {
            System.out.println("Error printing all customers");
        }
        System.out.println("All customers printed successfully");
    }
}