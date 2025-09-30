import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Recommendation> recommendations = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        seedData();
        while (true) {
            System.out.println("\nBook Recommendation System");
            System.out.println("1. View Recommendations");
            System.out.println("2. Clone and Modify Recommendation");
            System.out.println("3. Create New Recommendation");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": viewRecommendations(); break;
                case "2": cloneAndModify(); break;
                case "3": createNewRecommendation(); break;
                case "4": System.exit(0);
                default: System.out.println("Invalid option.");
            }
        }
    }

    private static void seedData() {
        Recommendation teens = new Recommendation("Teens");
        teens.addBook(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "Fantasy", 1997));
        teens.addBook(new Book("Suzanne Collins", "The Hunger Games", "Dystopian", 2008));
        recommendations.add(teens);

        Recommendation adults = new Recommendation("Adults");
        adults.addBook(new Book("George Orwell", "1984", "Dystopian", 1949));
        adults.addBook(new Book("Harper Lee", "To Kill a Mockingbird", "Classic", 1960));
        recommendations.add(adults);
    }

    private static void viewRecommendations() {
        for (int i = 0; i < recommendations.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + recommendations.get(i).getTargetAudience());
        }
        System.out.print("View details of which recommendation? (number, or 0 to return): ");
        int idx = Integer.parseInt(scanner.nextLine()) - 1;
        if (idx >= 0 && idx < recommendations.size()) {
            System.out.println(recommendations.get(idx));
        }
    }

    private static void cloneAndModify() {
        System.out.print("Clone which recommendation? (number): ");
        for (int i = 0; i < recommendations.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + recommendations.get(i).getTargetAudience());
        }
        int idx = Integer.parseInt(scanner.nextLine()) - 1;
        if (idx < 0 || idx >= recommendations.size()) {
            System.out.println("Invalid selection.");
            return;
        }
        Recommendation clone = recommendations.get(idx).clone();
        System.out.print("New target audience: ");
        clone.setTargetAudience(scanner.nextLine());
        modifyBooks(clone);
        recommendations.add(clone);
        System.out.println("Cloned and modified recommendation added.");
    }

    private static void createNewRecommendation() {
        System.out.print("Target audience: ");
        Recommendation rec = new Recommendation(scanner.nextLine());
        modifyBooks(rec);
        recommendations.add(rec);
        System.out.println("New recommendation added.");
    }

    private static void modifyBooks(Recommendation rec) {
        while (true) {
            System.out.println("\nCurrent books:");
            List<Book> books = rec.getBooks();
            for (int i = 0; i < books.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + books.get(i));
            }
            System.out.println("a. Add book");
            System.out.println("r. Remove book");
            System.out.println("q. Done");
            System.out.print("Choose an option: ");
            String opt = scanner.nextLine();
            if (opt.equals("a")) {
                System.out.print("Author: ");
                String author = scanner.nextLine();
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                System.out.print("Publication Year: ");
                int year = Integer.parseInt(scanner.nextLine());
                rec.addBook(new Book(author, title, genre, year));
            } else if (opt.equals("r")) {
                System.out.print("Remove which book? (number): ");
                int removeIdx = Integer.parseInt(scanner.nextLine()) - 1;
                rec.removeBook(removeIdx);
            } else if (opt.equals("q")) {
                break;
            }
        }
    }
}
