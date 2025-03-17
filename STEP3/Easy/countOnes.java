package STEP3.Easy;

public class countOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int n = nums.length;
        int j = 0;
        int max_count = 0;
        int count = 0;
        // loop the j until the end
        while (j < n) {
            count = 0;
            // check if the nums is 1
            if (nums[j] == 1) {
                // count the no of one's
                while (j < n && nums[j] == 1) {
                    count++;
                    j++;
                }
            }
            max_count = Math.max(max_count, count);
            j++;
        }
        // return the maximum one's
        max_count =  Math.max(max_count, count);

        return max_count;
    }
}
