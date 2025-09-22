import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private final Set<String> allowedPairs = new HashSet<>();

    private AccessControlService() {}

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void allow(String documentId, String username) {
        allowedPairs.add(documentId + ":" + username);
    }

    public boolean isAllowed(String documentId, String username) {
        return allowedPairs.contains(documentId + ":" + username);
    }
}
