public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        
        System.out.println("Original Array: ");
        QuickSort.printArray(arr);
        
        // Call the quickSort method on the array
        QuickSort.quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array: ");
        QuickSort.printArray(arr);
    }
}
