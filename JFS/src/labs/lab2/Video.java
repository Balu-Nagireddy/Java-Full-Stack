package labs.lab2;
public class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    // Constructor
    public Video(int idNumber, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(idNumber, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    // Getters and Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    // Override toString method to include director, genre, and year released
    @Override
    public String toString() {
        return "Video: " + super.toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased;
    }

    // Override equals method to include director, genre, and year released
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Video video = (Video) obj;
        return yearReleased == video.yearReleased &&
               director.equals(video.director) &&
               genre.equals(video.genre);
    }

    // Other methods specific to Video can be added here
}

