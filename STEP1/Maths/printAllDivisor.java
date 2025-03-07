package STEP1.Maths;

import java.util.ArrayList;

public class printAllDivisor {
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> list = new ArrayList<>();
        printAllDivisor(n, list);
        System.out.println(list);
    }

    public static ArrayList<Integer> printAllDivisor(int n, ArrayList<Integer> list){
        for (int i = 1; i * i<= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n/i){
                    list.add(n/i);
                }
            }

        }

        return list;
    }
}
