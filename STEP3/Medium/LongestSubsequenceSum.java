package STEP3.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubsequenceSum {
    public static void main(String[] args) {
        int nums[] = {1, 0, 1, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int BetterApproach(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        int count = 0;
        int lastSmall = Integer.MIN_VALUE;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (lastSmall == nums[i] - 1) {
                count++;
                // update lastSmall element
                lastSmall = nums[i];
            } else if (nums[i] != lastSmall) {
                lastSmall = nums[i];
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max;
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set  = new HashSet<>();

        // add every element
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int max = 1;


        // check if the element present
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i] - 1)){

                int maxLength = 1;
                int curELe = nums[i];

                while (set.contains(curELe + 1)){
                    maxLength ++;
                    curELe++;
                }

                max = Math.max(max, maxLength);
            }
        }

        return max;
    }

    public static int BruteForce(int[] nums) {
        return 1;
    }
}
