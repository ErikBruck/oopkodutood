public class Main {
    public static void main(String[] args) {
        // loob Library eksamplari
        Library cityLibrary = new Library("Tallinna Raamatukogu");

        // teeb raamatud
        Book book1 = new Book("Sipsik", "Eno Raud", 1962);
        Book book2 = new Book("Kevade", "Oskar Luts", 1969);

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        cityLibrary.printLibraryDetails();
    }
}
