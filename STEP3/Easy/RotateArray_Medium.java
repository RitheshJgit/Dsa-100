package STEP3.Easy;

import java.util.Arrays;

public class RotateArray_Medium {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // K = 3
        int k = 3;
        // 5,6,7,1,2,3,4
        if (arr.length < 2){

        }

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int first, int end) {
        while (first < end) {
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;
        }

    }
}

/*
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) {
        } else if (nums.length == 2) {
            for (int i = 0; i < k; i++) {
                swap(nums);
            }
        } else {
            int count = 0;
            int n = nums.length - 1;
            while (count < k) {
                // Store the last element
                int rotateElement = nums[n];

                // Swap the elements
                for (int i = n - 1; i >= 0; i--) {
                    nums[i + 1] = nums[i];
                }
                nums[0] = rotateElement;
                count++;
            }
        }
    }

    public void swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }
}
 */