public interface LibraryOperations{
    void addBook(Book book);
    void removeBook(int bookId);
    void printAllBooks();
    void addCustomer(Customer customer);
    void removeCustomer(int customerId);
    void printAllCustomers();
}