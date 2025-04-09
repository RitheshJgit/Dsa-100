package STEP3.Medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int n = matrix.length;

            int top = 0;
            int right = matrix[0].length - 1;
            int left = 0;
            int bottom = matrix.length - 1;

       while (left <= right && top <= bottom){
           // print from left to right
           for (int i = top; i <= right; i++) {
               list.add(matrix[top][i]);
           }

           top++;

           // print top to bottom
           for (int i = top; i <= bottom; i++) {
               list.add(matrix[i][right]);
           }

           right --;

           // print right to left
           if(top <= bottom){
               for (int i = right; i >= left ; i--) {
                   list.add(matrix[bottom][i]);
               }
               bottom--;
           }


           // bottom to top
           if(left <= right){
               for (int i = bottom; i >= top ; i--) {
                   list.add(matrix[i][left]);
               }
               left++;
           }


       }

        return list;

    }

    public static void main(String[] args) {

        //Matrix initialization.
        int[][] mat = {
                {1,  2,  3,  4 },
                {5,  6,  7,  8 },
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };

        List<Integer> ans = spiralOrder(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}