package labs.lab2;
public class JournalPaper extends WrittenItem {
    private int yearPublished;

    // Constructor
    public JournalPaper(int idNumber, String title, int numberOfCopies, String author, int yearPublished) {
        super(idNumber, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    // Getter for yearPublished
    public int getYearPublished() {
        return yearPublished;
    }

    // Setter for yearPublished
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Override toString method to include year published
    @Override
    public String toString() {
        return "JournalPaper: " + super.toString() + ", Year Published: " + yearPublished;
    }

    // Override equals method to include year published
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        JournalPaper that = (JournalPaper) obj;
        return yearPublished == that.yearPublished;
    }

    // Other methods can be overridden or overloaded as needed

    // Additional methods specific to JournalPaper can be added here
}
