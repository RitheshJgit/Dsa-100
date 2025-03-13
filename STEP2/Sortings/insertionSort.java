package STEP2.Sortings;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            // assume that first element sorted
            for (int j = i; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    // swap the elements
                    swap(arr, j, j-1);
                }
                else {
                    break; // for sorted array (Optimized)
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
