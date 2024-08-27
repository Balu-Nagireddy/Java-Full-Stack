package labs.lab2;
public class CD extends MediaItem {
    private String artist;
    private String genre;

    // Constructor
    public CD(int idNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(idNumber, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    // Getters and Setters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Override toString method to include artist and genre
    @Override
    public String toString() {
        return "CD: " + super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }

    // Override equals method to include artist and genre
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        CD cd = (CD) obj;
        return artist.equals(cd.artist) &&
               genre.equals(cd.genre);
    }

    // Other methods specific to CD can be added here
}

