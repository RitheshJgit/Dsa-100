package STEP1.Patterns;

public class AllPatterns {
    public static void main(String[] args) {
        inversePyramid();
    }

    public static void triangle() {
        /*

        *
        **
        ***
        ****

        1
        12
        123
        1234

         */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle() {
        /*

        1
        22
        333
        4444

         */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i) + " ");
            }
            System.out.println();
        }
    }

    public static void inverseTriangle() {
        /*

         ****
         ***
         **
         *

         */
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((i) + " ");
            }
            System.out.println();
        }
    }

    public static void InverseTriangle() {
        /*
        ` *
         **
        *+*
       ****

         */
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }


    public static void pyramid() {
        /*

          *
         ***
        *****
       *******


         */
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void inversePyramid() {
        /*

     *******
      *****
       ***
        *


         */
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = (2*n)- (i * 2 + 1); j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


