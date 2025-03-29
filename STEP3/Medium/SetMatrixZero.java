package STEP3.Medium;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 1, 0},
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

       nums =  setZero(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void optimal(int[][] nums){

    }

    public static int[][] setZero(int[][] nums) {
        int row = -1;
        int col = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 0) {
                    row = i;
                    col = j;
                }
            }
        }

        setAllZeros(nums, row, col);


        return nums;
    }

    public static void setAllZeros(int[][] nums, int row, int col) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
               if(row == i || col == j){
                   nums[i][j] = 0;
               }
            }
        }
    }
}
