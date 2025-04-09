package STEP3.Medium;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 1, 0},
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        nums = setZero(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void optimal(int[][] matrix) {
        int col0 = 1;

        // step 1 - mark zero for first row and col
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    // for i-th row mark as 0
                    matrix[i][0] = 0;

                    // check for the collision
                    if (j != 0) {
                        // for j-th col mark as 0
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step - 2 mark zero for the elements

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                // if any zero found at first row or column mark as zero
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle first row separately
        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first column separately
        if (col0 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

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
                if (row == i || col == j) {
                    nums[i][j] = 0;
                }
            }
        }
    }
}
