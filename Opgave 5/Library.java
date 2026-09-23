import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> findAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books ) {
            if (book.getTitle().equalsIgnoreCase(title)) {
               return book;
            }
        }
        return null;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
