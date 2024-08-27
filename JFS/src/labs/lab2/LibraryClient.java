package labs.lab2;
public class LibraryClient {
    public static void main(String[] args) {
        // Create instances of Book and JournalPaper
        Book book = new Book(1, "1984", 5, "George Orwell");
        JournalPaper journalPaper = new JournalPaper(2, "Relativity", 3, "Albert Einstein", 1915);

        // Create instances of Video and CD
        Video video = new Video(3, "The Matrix", 4, 136, "The Wachowskis", "Science Fiction", 1999);
        CD cd = new CD(4, "Thriller", 6, 42, "Michael Jackson", "Pop");

        // Print details of each item
        System.out.println("Initial Inventory:");
        book.print();
        journalPaper.print();
        video.print();
        cd.print();

        // Check out a book and a CD
        System.out.println("\nChecking out 2 copies of the book '1984' and 1 copy of 'Thriller':");
        book.checkOut(2);
        cd.checkOut(1);

        // Check in a journal paper and a video
        System.out.println("\nChecking in 1 copy of the journal paper 'Relativity' and 2 copies of 'The Matrix':");
        journalPaper.checkIn(1);
        video.checkIn(2);

        // Print updated inventory details
        System.out.println("\nUpdated Inventory:");
        book.print();
        journalPaper.print();
        video.print();
        cd.print();

        // Add new copies to the inventory
        System.out.println("\nAdding 3 new copies of '1984' and 2 new copies of 'Thriller':");
        book.addItem(3);
        cd.addItem(2);

        // Print final inventory details
        System.out.println("\nFinal Inventory:");
        book.print();
        journalPaper.print();
        video.print();
        cd.print();

        // Check equality of items
        System.out.println("\nChecking Equality:");
        Book anotherBook = new Book(1, "1984", 6, "George Orwell");
        System.out.println("Book '1984' equals another instance of the same book: " + book.equals(anotherBook));
        
        Video anotherVideo = new Video(3, "The Matrix", 6, 136, "The Wachowskis", "Science Fiction", 1999);
        System.out.println("Video 'The Matrix' equals another instance of the same video: " + video.equals(anotherVideo));

        // Attempt to check out more copies than available
        System.out.println("\nAttempting to check out 10 copies of 'The Matrix':");
        video.checkOut(10); // This will not change the count as there are not enough copies

        // Print final inventory details
        System.out.println("\nFinal Inventory After Invalid Checkout Attempt:");
        video.print();
    }
}

