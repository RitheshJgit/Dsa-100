package STEP3.Easy;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int k = 8;
        System.out.println(LongestSubArray(arr, k));
    }

    public static int findLongestSubArray(int[] nums, int k) {
        int sum = 0;
        // using two loops
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            // to get the sub array quickly by taking from large length
            for (int j = i + 1; j >= 0; j--) {
                sum += nums[j];
            }

            // check if the sub array elements contain k sum return
            if(sum == k){
                return  nums.length - i;
            }
        }

        // if then it contain one element only if should for it
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == k){
                return 1;
            }
        }
        return -1;
    }

    public static int LongestSubArray(int[] arr, int k) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0; // Reset sum for each new starting point

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }


}
