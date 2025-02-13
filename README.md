## QuickSort Algorithm

The project implements various sorting algorithms. The **QuickSort** algorithm has been added as one of the features.


### QuickSort Overview:
- QuickSort is a divide-and-conquer algorithm.
- It partitions the array around a pivot element and recursively sorts the subarrays.

### How to Use:
```java
int[] arr = {10, 7, 8, 9, 1, 5};
QuickSort.quickSort(arr, 0, arr.length - 1);
```

### Selection Sort
- Selection Sort is an in-place comparison sorting algorithm.
- It divides the input array into two subarrays: a sorted subarray and an unsorted subarray.

### How to Use:
```java
int[] arr = {64, 25, 12, 22, 11};
SelectionSort selectionSort = new SelectionSort(numbers);
selectionSort.SortArray();
```
### Insertion Sort:
-  Sorting algorithm that puts together the final sorted array element by element
-  Loops through an array and extracts one component from the beginning data to insert it into the right place

### How to Use:
```java
int[] numbers = { 23, 3, 15, 6, 31, 10, 1 };
InsertionSort insertionSort = new InsertionSort(numbers);
insertionSort.SortArray();
```
