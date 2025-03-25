package STEP3.Medium;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {-2,-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }

        int max = Integer.MIN_VALUE;
        int i = 0;
        int sum = 0;

        while (i < nums.length) {

            sum += nums[i];

            if(sum > max){
                max = sum;
            }
 
            if (sum < 0) {
                sum = 0;
            }
            i++;
        }

        return max;
    }

    public static int BruteForce(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }


        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // assign sum to zero for each iteration
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                // get the frequent max for each iteration
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
