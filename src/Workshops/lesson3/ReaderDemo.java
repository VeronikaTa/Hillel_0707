package Workshops.lesson3;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Taras Kovalchuk", 2378, "Ukrainian philology", "26.05.99", "+380913054087");
        Reader reader2 = new Reader("Inna Komarenko", 4567, "Ukrainian philology", "16.04.02", "+380613754880");
        Reader reader3 = new Reader("Marco Poloo", 57390, "Ukrainian philology", "10.02.02", "+380913054780");
        Reader[] readersArr = {reader1, reader2, reader3};

        Book book1 = new Book("Ivanhoe", "Walter Scott");
        Book book2 = new Book("Rob Roy", "Walter Scott");
        Book book3 = new Book("Oliver Twist", "Charles Dickens");

        Book[] booksArr = {book1, book2, book3};
        printReaders(readersArr);
        printBooks(booksArr);

        reader1.takeBook(3);
        reader1.takeBook(booksArr);
        reader2.returnBook(3);
        reader2.returnBook(booksArr);
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Readers list");
        for (Reader reader : readers) {
            System.out.println(reader);
        }
        System.out.println();
    }

    private static void printBooks(Book[] books) {
        System.out.println("Books list");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}
