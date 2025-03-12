package STEP2.Sortings;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        // Select the minimum element and swap with first element and do for the rest
        int[] arr = {6,2,8,4,9,0};

        // Need to run this in double for loop
        // i - for get the number wise min number
        // j - for finding the minimum index number

        for (int i = 0; i < arr.length - 1; i++) {
            // get the index
            int index = i;
            // find the smallest element index
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            // swap with i element
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
