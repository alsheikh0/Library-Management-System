import java.util.Random;

public class Book {
    String title;
    String author;
    int year;
    int bookId = 8666;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        Random random = new Random();
        this.bookId = bookId + 5;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getBookId() {
        return bookId;
    }
}
