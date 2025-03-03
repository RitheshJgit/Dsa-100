package STEP1.Patterns;

public class AllPatterns {
    public static void main(String[] args) {
        diamond();
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

    public static void diamond(){
        /*

        *
       ***
      *****
     *******
      *****
       ***
        *

         */
        int n = 4;
        for (int i = 0; i < 2 * n -1 ; i++) {
            int space;
            int star;
            if (i < n) {
                 space = n-i-1;
                 star = 2 * i +1;
            }

            else{
                space = i - n + 1;
                star = (2 * n - 1) - (2 * space);
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


