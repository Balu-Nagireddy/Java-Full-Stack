package labs.lab2;

public abstract class MediaItem extends Item {
    private int runtime; // runtime in minutes

    // Constructor
    public MediaItem(int idNumber, String title, int numberOfCopies, int runtime) {
        super(idNumber, title, numberOfCopies);
        this.runtime = runtime;
    }

    // Getter for runtime
    public int getRuntime() {
        return runtime;
    }

    // Setter for runtime
    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    // Print details of the media item
    @Override
    public void print() {
        System.out.println(toString());
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        MediaItem mediaItem = (MediaItem) obj;
        return runtime == mediaItem.runtime;
    }

    // Other common operations for MediaItem can be added here
}
