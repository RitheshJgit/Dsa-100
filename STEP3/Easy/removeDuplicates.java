package STEP3.Easy;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,4,5,6,6};
        int n = removeDuplicates(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
    public static int removeDuplicates(int[] arr){
        // using two pointer method to resolve this problem
        int i = 0;
        int j = 1;

        while (j < arr.length){
            // if the number is unique to store in the same array
            if(arr[i] != arr[j]){
                // increment the array
                i ++;
                arr[i] = arr[j];
            }
            j++;
        }

        return i + 1;
//        for (int k = i + 1; k < arr.length; k++) {
//            arr[k] = 0;
//        }
    }
}
