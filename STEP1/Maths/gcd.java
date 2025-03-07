package STEP1.Maths;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class gcd {
    public static void main(String[] args) {
        GCD(9,12);
    }

    // Optimized Code

    public static void GCD(int n1, int n2){
        while (n2 > 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        System.out.println(n1);
    }


    // Brute Force
    public static void findGCD(int N1, int N2){

        int gcd = 0;
        for (int i = 1; i <= Math.max(N1, N2); i++) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }

    // Normal Approach
    public static void findGCD2(int N1, int N2){

        int gcd = 0;
        for (int i = Math.min(N1, N2); i >= 1; i--) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }

    public static void findGCD3(int N1, int N2){
        while (N1 > 0 && N2 > 0) {
            if (N1 > N2) {
                N1 = N1 % N2;
            }else {
                N2 = N2 % N1;
            }
        }

        if (N1 == 0) {
            System.out.println(N2);
        }else {
            System.out.println(N1);
        }
    }



}
