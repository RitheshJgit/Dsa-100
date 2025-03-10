package STEP1.Maths;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        boolean isContinue = true;
        Scanner s = new Scanner(System.in);
        while (isContinue){
            // get the first element
            System.out.println("Enter the First Number  : ");
            int num1 = s.nextInt();

            // get the second element
            System.out.println("Enter the second Number : ");
            int num2 = s.nextInt();

            // print the operation
            System.out.println("Perform Any operation[+, -, /, *]: ");

            // get the operation
            char operator = s.next().charAt(0);

            switch (operator){
                case '+':
                    // add the given numbers
                    System.out.println("Sum of the Numbers : "+  add(num1, num2));
                    break;

                case '-':
                    // sub the given numbers
                    System.out.println("Sum of the Numbers : "+  sub(num1, num2));
                    break;
                case '*':
                    // mul the given numbers
                    System.out.println("Sum of the Numbers : "+  mul(num1, num2));
                    break;
                case '/':
                    // div the given numbers
                    System.out.println("Sum of the Numbers : "+  div(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            // check for the user still want to continue
            System.out.println("Do You Want to continue [Y/N] : ");
            char ch = s.next().charAt(0);

            // continue if Y
            if(ch == 'Y' || ch == 'y'){
                continue;
            }
            // break
            else {
                System.out.println("Exiting...");
                isContinue = false;
            }
        }
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int sub(int num1, int num2){
        return num1 - num2;
    }
    public static int mul(int num1, int num2){
        return num1 * num2;
    }
    public static int div(int num1, int num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
}
