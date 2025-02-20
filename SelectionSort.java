import java.util.Arrays;

public class SelectionSort extends Sort
{
    public SelectionSort(int[] array)
    {
        super(array);
    }

    @Override
    public void SortArray()
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}