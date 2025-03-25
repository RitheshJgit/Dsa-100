package STEP3.Medium;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] nums = {7, 6, 4, 3, 1};
        System.out.println(optimized(nums));
    }

    public static int optimized(int[] nums) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            minPrice = Math.min(minPrice, nums[i]);
            maxPro = Math.max(maxPro, nums[i] - minPrice);
        }
        return maxPro;
    }

    public static int maxProfit(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[j] - nums[i]);                // get the profit

            }
        }

        return (max <= 0) ? 0 : max;
    }


}
