import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] numbers = { 23, 3, 15, 6, 31, 10, 1 };

        System.out.println("Unsorted Array: " + Arrays.toString(numbers));

        InsertionSort insertionSort = new InsertionSort(numbers);
        insertionSort.SortArray();

        System.out.println("Sorted Array: " + Arrays.toString(insertionSort.getArray()));

        if (isSorted(insertionSort.getArray())) {
            System.out.println("Test Passed: Array is sorted.");
        } else {
            System.out.println("Test Failed: Array is not sorted.");
        }
    }
    
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
