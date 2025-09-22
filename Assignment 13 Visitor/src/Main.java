public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("document.txt", 2);
        File file2 = new File("image.jpg", 5);
        Directory subDir = new Directory("subdir");
        File file3 = new File("notes.txt", 1);

        root.add(file1);
        root.add(file2);
        root.add(subDir);
        subDir.add(file3);

        // Size calculation
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

        // Search for .txt files
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Found .txt files:");
        for (File f : searchVisitor.getMatchedFiles()) {
            System.out.println(f.getName());
        }
    }
}
