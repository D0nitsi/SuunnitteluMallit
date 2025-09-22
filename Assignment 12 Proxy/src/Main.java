public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create users
        User alice = new User("alice");
        User bob = new User("bob");

        // Create documents
        Document doc1 = new Document("doc1", "2024-06-01", "Unprotected content");
        Document doc2 = new Document("doc2", "2024-06-02", "Protected content");

        // Add documents to library
        library.addUnprotectedDocument(doc1);
        library.addProtectedDocument(doc2, new String[]{"alice"}); // Only Alice can access

        // Access documents
        try {
            System.out.println("Alice reads doc1: " + library.getDocument("doc1").getContent(alice));
            System.out.println("Bob reads doc1: " + library.getDocument("doc1").getContent(bob));
            System.out.println("Alice reads doc2: " + library.getDocument("doc2").getContent(alice));
            System.out.println("Bob reads doc2: " + library.getDocument("doc2").getContent(bob));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
