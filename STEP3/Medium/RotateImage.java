package STEP3.Medium;

public class RotateImage {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        Optimized(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int n = matrix[i].length;
            // get the length of each i-th row stoe in a array
            int[] arr = new int[n];

            // store the ith row element
            for (int temp = 0; temp < n; temp++) {
                arr[temp] = matrix[i][temp];
            }

            for (int j = 0; j < n; j++) {
                int temp = matrix[j][n-i-1];
                matrix[j][n-i-1] = arr[j];
                arr[j] = temp;
            }
        }

    }

    public static void Optimized(int[][] matrix){

        int n = matrix.length;

        // step - 1 transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse the matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < matrix[i].length / 2; j++) {
                // swap the nums
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
