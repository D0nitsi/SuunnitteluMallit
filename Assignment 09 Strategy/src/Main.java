public class Main {
    public static void main(String[] args) {
        int[] smallDataSet = DataSetGenerator.generateRandomArray(30);
        int[] largeDataSet = DataSetGenerator.generateRandomArray(100000);

        SortContext context = new SortContext();

        SortingStrategy[] strategies = {new BubbleSort(), new QuickSort(), new MergeSort()};
        String[] strategyNames = {"Bubble Sort", "Quick Sort", "Merge Sort"};

        for (int i = 0; i < strategies.length; i++) {
            System.out.println("Testing " + strategyNames[i]);

            // Small data set
            int[] smallCopy = smallDataSet.clone();
            context.setStrategy(strategies[i]);
            long start = System.nanoTime();
            context.executeStrategy(smallCopy);
            long end = System.nanoTime();
            System.out.println("Small data set time: " + (end - start) + " ns");

            // Large data set
            int[] largeCopy = largeDataSet.clone();
            start = System.nanoTime();
            context.executeStrategy(largeCopy);
            end = System.nanoTime();
            System.out.println("Large data set time: " + (end - start) + " ns");
        }
    }
}