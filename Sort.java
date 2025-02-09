import java.util.Arrays;

public abstract class Sort
{
    protected int[] array;

    public Sort(int[] array)
    {
        this.array = array;
    }

    public abstract void SortArray();

    public void printArray()
    {
        System.out.println(Arrays.toString(array));
    }
}