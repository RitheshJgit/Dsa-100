package STEP3.Medium;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int nums[] = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int i = 0, j = 0, e = 0;

        while (j < nums.length && e < nums.length) {
            // If positive add in ans
            if (i < nums.length && nums[i] >= 0 && e % 2 == 0) {
                    ans[e] = nums[i];
                    i++;
                    e++;

            } else if (i < nums.length && nums[i] < 0) {
                i++;
            } else if (nums[j] < 0) {
                if (e % 2 == 1) {
                    ans[e] = nums[j];
                    e++;
                    j++;
                }
            } else {
                j++;
            }
        }

        return ans;
    }

    public static int[] BruteForce(int[] nums) {

        // store even numbers
        ArrayList<Integer> even = new ArrayList<>();

        // store odd numbers
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : nums) {
            if (num >= 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        int e = 0, o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(e++);
            } else {
                nums[i] = odd.get(o++);
            }
        }

        return nums;
    }
}
