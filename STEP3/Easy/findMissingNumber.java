package STEP3.Easy;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int n = missingNumber(arr);
        System.out.println(n);
    }

    public static int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            // Avoid the -1 out of bounds
            if(nums[i] != 0){
                // get the correct index the element
                int crt_index = nums[i] - 1;

                // check the elment int the crt index
                if(nums[i] != i + 1){
                    // swap
                    int temp = nums[i];
                    nums[i] = nums[crt_index];
                    nums[crt_index] = temp;
                }
            }
        }

        for(int i =0; i< nums.length; i++){
            // check for the missing number
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return -1;
    }
}
