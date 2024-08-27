package labs.lab2;

public abstract class WrittenItem extends Item {
    private String author;

    // Constructor
    public WrittenItem(int idNumber, String title, int numberOfCopies, String author) {
        super(idNumber, title, numberOfCopies);
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Print details of the written item
    @Override
    public void print() {
        System.out.println(toString());
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        WrittenItem that = (WrittenItem) obj;
        return author.equals(that.author);
    }
}

