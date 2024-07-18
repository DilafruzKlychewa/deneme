package Sorting_Algorithms.BubbleSort;

import Sorting_Algorithms.InsertionSort.InsertionSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {

        int [] arr = {3,1,2,};

        System.out.println("BSort oncesi array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("******************");

        System.out.println("BSort Sonrasi Array : ");
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
