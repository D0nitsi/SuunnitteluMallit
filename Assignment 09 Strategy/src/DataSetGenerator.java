import java.util.Random;

public class DataSetGenerator {
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Random integers between 0 and 999
        }
        return array;
    }
}