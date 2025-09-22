import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, DocumentInterface> documents = new HashMap<>();

    public void addUnprotectedDocument(Document doc) {
        documents.put(doc.getId(), doc);
    }

    public void addProtectedDocument(Document doc, String[] allowedUsers) {
        DocumentProxy proxy = new DocumentProxy(doc);
        documents.put(doc.getId(), proxy);
        AccessControlService acs = AccessControlService.getInstance();
        for (String user : allowedUsers) {
            acs.allow(doc.getId(), user);
        }
    }

    public DocumentInterface getDocument(String id) {
        return documents.get(id);
    }
}
