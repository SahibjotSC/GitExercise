import java.util.Arrays;

public class SelectionSortTest
{
    public static void main(String[] args) {
        testSelectionSort(new int[]{5, 2, 9, 1, 5, 6}, new int[]{1, 2, 5, 5, 6, 9}, "Test 1: Random Order");
        testSelectionSort(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, "Test 2: Already Sorted");
        testSelectionSort(new int[]{9, 8, 7, 6, 5}, new int[]{5, 6, 7, 8, 9}, "Test 3: Reverse Sorted");
        testSelectionSort(new int[]{3, 3, 2, 1, 2}, new int[]{1, 2, 2, 3, 3}, "Test 4: Duplicates");
        testSelectionSort(new int[]{42}, new int[]{42}, "Test 5: Single Element");
        testSelectionSort(new int[]{}, new int[]{}, "Test 6: Empty Array");
    }

    public static void testSelectionSort(int[] input, int[] expected, String testName) {
        System.out.println(testName + " - Before:  " + Arrays.toString(input));

        SelectionSort selectionSort = new SelectionSort(input);
        selectionSort.SortArray();

        System.out.println(testName + " - After:   " + Arrays.toString(input));
        System.out.println("Expected:       " + Arrays.toString(expected));

        boolean passed = Arrays.equals(input, expected);
        System.out.println(testName + " - Result:  " + (passed ? "PASSED" : "FAILED"));
        System.out.println();
    }
}