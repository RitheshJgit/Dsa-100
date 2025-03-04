package STEP1.Patterns;

public class AllPatterns {
    public static void main(String[] args) {
        alphabetTriangle();
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
            for (int j = (2 * n) - (i * 2 + 1); j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void diamond() {
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
        for (int i = 0; i < 2 * n - 1; i++) {
            int space;
            int star;
            if (i < n) {
                space = n - i - 1;
                star = 2 * i + 1;
            } else {
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

    public static void halfPyramid() {

        /*

         *
         * *
         * * *
         * * * *
         * * *
         * *
         *

         */
        int n = 4;

        for (int i = 0; i < 2 * n - 1; i++) {
            int size;
            if (i < n) {
                size = i + 1;
            } else {
                size = 2 * n - i - 1;
            }
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void onesAndZeros() {

        /*

        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1


         */

        int n = 6;
        for (int i = 0; i < n; i++) {
            int start = 0;
            for (int j = 0; j < i; j++) {

                start = ((i + j) % 2 != 0) ? 1 : 0;


//                if( (i + j) % 2 != 0)
//                    System.out.print("1 ");
//
//                else
//                    System.out.print("0 ");

                System.out.print(start + " ");

            }
            System.out.println();
        }
    }

    public static void doubleTriangle() {
        /*

            1             1
            1 2         2 2
            1 2 3     3 3 3
            1 2 3 4 4 4 4 4


         */

        int n = 4;

        for (int i = 0; i < n; i++) {
            int start = i + 1;
            for (int j = 0; j < start; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = 0; j < (2 * n) - (2 * start); j++) {
                System.out.print("  ");
            }
            for (int j = start; j > 0; j--) {
                System.out.print(start + " ");
            }
            System.out.println();
        }

    }

    public static void sortedTriangle() {
        int count = 1;
        int n = 6;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void alphabetTriangle() {
        int n = 5;
        // Method - 1

        /*
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                char ch = (char) ((97 + j) - 32);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println();
        */

        // Method 2

        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}