package Java_homework.homework_4;

import java.util.Arrays;
import java.util.Random;

public class HeapSort{

    public static void main(String args[])
    {
        int arr[] = fillArray();
        HeapSort ob = new HeapSort();
        String strSortArr = Arrays.toString(arr);
        System.out.printf("Исходный массив: %s\n", strSortArr);
        System.out.println("Отсортированный массив: ");
        ob.sort(arr);
        printArray(arr);
    }

    public void sort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

     void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int left = 2*i + 1; 
        int right = 2*i + 2; 

        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static int[] fillArray() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}

