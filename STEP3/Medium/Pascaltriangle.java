package STEP3.Medium;

import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle {
    public static void main(String[] args) {

      generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        // track the number of previous list
        int index;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < numRows; i++) {
            index = 1;
            for (int j = 0; j < i + 1; j++) {
                 if(j == 0 || j == i){
                     list.get(i).add(1);
                 }

                 else {
                     list.get(i).add( list.get(i-1).get(index-1) + list.get(i-1).get(index));
                     index++;
                 }
            }
        }
        System.out.println(list);
        return list;
    }

}


