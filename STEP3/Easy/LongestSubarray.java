package STEP3.Easy;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int k = 5;
        System.out.println(LongestSubArray_Optimized(arr, k));
    }

    // using sliding window problem
    public static int LongestSubArray_Optimized(int[] nums, int k) {
        // assign left, right and sum
        int left = 0, right = 0, max = 0;
        int sum = 0;
        int n = nums.length;

        while (right < n) {
            // sum the elementsExpand the window
            sum += nums[right];

            // sum exceeds k
            while (sum > k && left < n) {
                sum -= nums[left];
                left++;
            }

            // if you found the sum == k update the length
            if (sum == k) {
                max = Math.max(max, right - left + 1);
            }

            // move to right
            right++;
        }

        return max;
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
            if (sum == k) {
                return nums.length - i;
            }
        }

        // if then it contain one element only if should for it
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
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
