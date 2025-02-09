import java.util.Arrays;

public class QuickSort {

    // Public method to allow sorting from Main.java
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }


    // Main function that implements QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to find the partition index
    private static int partition(int[] arr, int low, int high) {
        // Pivot element is chosen as the last element in the array
        int pivot = arr[high];

        // Pointer for the smaller element
        int i = (low - 1);

        // Traverse through the array, compare each element with the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap elements that are smaller than or equal to the pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1, so the pivot is in the right place
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
