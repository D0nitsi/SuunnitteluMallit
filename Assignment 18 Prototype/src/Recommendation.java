import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        }
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Recommendation clone() {
        Recommendation copy = new Recommendation(targetAudience);
        for (Book book : books) {
            copy.addBook(book.clone());
        }
        return copy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target Audience: ").append(targetAudience).append("\n");
        for (int i = 0; i < books.size(); i++) {
            sb.append("  ").append(i + 1).append(". ").append(books.get(i)).append("\n");
        }
        return sb.toString();
    }
}
