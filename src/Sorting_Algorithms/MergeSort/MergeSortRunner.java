package Sorting_Algorithms.MergeSort;

import Sorting_Algorithms.InsertionSort.InsertionSort;

import java.util.Arrays;

public class MergeSortRunner {
    public static void main(String[] args) {

        int arr[] ={5,3,4,2};

        System.out.println("MSort oncesi array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("******************");

        System.out.println("MSort Sonrasi Array : ");
        MergeSort.mergeSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}
