import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String extension;
    private List<File> matchedFiles = new ArrayList<>();

    public SearchVisitor(String extension) {
        this.extension = extension;
    }

    public List<File> getMatchedFiles() { return matchedFiles; }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(extension)) {
            matchedFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement child : directory.getChildren()) {
            child.accept(this);
        }
    }
}
