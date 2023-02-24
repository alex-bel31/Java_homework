package Java_homework.homework_4;

import java.util.Arrays;
import java.util.Random;

public class HeapSort{

    public static void main(String args[])
    {
        int arr[] = fillArray();
        HeapSort ob = new HeapSort();
       
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


    public static int[] fillArray() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}

