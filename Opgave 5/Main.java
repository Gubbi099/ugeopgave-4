public class Main {

    public static void main(String[] args) {
        Library library1 = new Library("EK Library");
        library1.addBook(new Book("1989", "Preben", true));
        library1.addBook(new Book("1982", "Kurt", true));
        library1.addBook(new Book("1983", "John", true));
        library1.addBook(new Book("1985", "Sigurd", true));
        library1.addBook(new Book("1988", "Jørgen", true));

        library1.findBookByTitle("1989").borrow();

        System.out.println(library1.findAvailableBooks());

        library1.printAllBooks();
    }
}
