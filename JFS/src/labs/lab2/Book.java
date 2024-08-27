package labs.lab2;
public class Book extends WrittenItem {

    // Constructor
    public Book(int idNumber, String title, int numberOfCopies, String author) {
        super(idNumber, title, numberOfCopies, author);
    }

    // Override toString method (if any specific representation is needed)
    @Override
    public String toString() {
        return "Book: " + super.toString();
    }

    // Other methods can be overridden or overloaded as needed

    // Additional methods specific to Book can be added here
}

