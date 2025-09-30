public class Book implements Cloneable {
    private String author;
    private String title;
    private String genre;
    private int publicationYear;

    public Book(String author, String title, String genre, int publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public Book clone() {
        return new Book(author, title, genre, publicationYear);
    }

    public String toString() {
        return "\"" + title + "\" by " + author + " (" + genre + ", " + publicationYear + ")";
    }
}
