import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void printLibraryDetails() {
        System.out.println("Raamatukogu nimi: " + name);
        System.out.println("Praegu olemasolevad raamatud:");
        for (Book book : books) {
            System.out.println(" - " + book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
        }
    }
}
