import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {342, 835, 921, 471, 620, 252, 748, 389, 523, 548, 973, 256, 512, 376, 152, 378, 568 };
        System.out.println(Arrays.toString(numbers));

        BubbleSort bubbleSort = new BubbleSort(numbers);
        bubbleSort.SortArray();
        System.out.println("Sorted with Bubble Sort: ");
        bubbleSort.printArray();
    }
}