package Java_homework.homework_4;

import java.util.Arrays;
import java.util.Random;

public class HeapSort{

    public static void main(String args[])
    {
        int arr[] = fillArray();
      
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

