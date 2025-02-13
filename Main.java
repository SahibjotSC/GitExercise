import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 342, 835, 921, 471, 620, 252, 748, 389, 523, 548, 973, 256, 512, 376, 152, 378, 568 };
        System.out.println(Arrays.toString(numbers));

        // Create QuickSort instance and sort the array
        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));

        BubbleSort bubbleSort = new BubbleSort(numbers);
        bubbleSort.SortArray();
        System.out.println("Sorted with Bubble Sort: ");
        bubbleSort.printArray();

        // Create SelectionSort instance and sort the array
        SelectionSort selectionSort = new SelectionSort(numbers);
        selectionSort.SortArray();
        System.out.println("Sorted with Selection Sort: ");
        selectionSort.printArray();

        InsertionSort insertionSort = new InsertionSort(numbers);
        insertionSort.SortArray();
        System.out.println("Sorted with Insertion Sort: ");
        System.out.println(Arrays.toString(insertionSort.getArray()));

    }
}
