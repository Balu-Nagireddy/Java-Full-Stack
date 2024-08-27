package labs.lab2;
public abstract class Item {
    private int idNumber;
    private String title;
    private int numberOfCopies;

    // Constructor
    public Item(int idNumber, String title, int numberOfCopies) {
        this.idNumber = idNumber;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    // Getters
    public int getIdNumber() {
        return idNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    // Setters
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    // Check in item (increase number of copies)
    public void checkIn(int copies) {
        if (copies > 0) {
            numberOfCopies += copies;
        }
    }

    // Check out item (decrease number of copies)
    public void checkOut(int copies) {
        if (copies > 0 && numberOfCopies >= copies) {
            numberOfCopies -= copies;
        }
    }

    // Add item (adds copies to inventory)
    public void addItem(int copies) {
        if (copies > 0) {
            numberOfCopies += copies;
        }
    }

    // Print details of the item
    public void print() {
        System.out.println(toString());
    }

    // Override toString method
    @Override
    public String toString() {
        return "ID: " + idNumber + ", Title: " + title + ", Copies: " + numberOfCopies;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return idNumber == item.idNumber &&
               numberOfCopies == item.numberOfCopies &&
               title.equals(item.title);
    }
}
