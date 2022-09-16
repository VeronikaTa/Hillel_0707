package Workshops.lesson3;

public class Reader {

    private String nameAndSurname;
    private int readerTicketNumber;
    private String faculty;
    private String dOB;
    private String phoneNumber;

    public Reader(String nameAndSurname, int readerTicketNumber, String faculty, String dob, String phoneNumber) {
        this.readerTicketNumber = readerTicketNumber;
        this.nameAndSurname = nameAndSurname;
        this.faculty = faculty;
        this.dOB = dob;
        this.phoneNumber = phoneNumber;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getReaderTicketNumber() {
        return readerTicketNumber;
    }

    public void setReaderTicketNumber(int readerTicketNumber) {
        this.readerTicketNumber = readerTicketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", readerTicketNumber=" + readerTicketNumber +
                ", faculty='" + faculty + '\'' +
                ", dOB='" + dOB + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(int quantityBooks) {
        System.out.println(this.nameAndSurname + " took " + quantityBooks + " books");
    }

    public void returnBook(int quantityBooks) {
        System.out.println(this.nameAndSurname + " returned " + quantityBooks + " books");
    }

    public void takeBook(Book[] books) {
        System.out.println(this.nameAndSurname + " took books: ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " , " + book.getBookAuthor());
        }
        System.out.println();
    }

    public void returnBook(Book[] books) {
        System.out.println(this.nameAndSurname + " returned books: ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " , " + book.getBookAuthor());
        }
        System.out.println();
    }
}
