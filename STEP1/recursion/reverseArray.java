package STEP1.recursion;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10,8,6,4,2,0};
        recursion(arr, 0, arr.length-1);
    }

    public static int[] recursion(int[] arr, int s, int e){
        if(s >= e){
            System.out.println(Arrays.toString(arr));
            return arr;
        }

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        return recursion(arr,s+1,e-1);
    }
}
