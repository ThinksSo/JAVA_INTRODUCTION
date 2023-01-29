package TASKS;

import java.util.Scanner;

public class calc {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int num1;
        int num2;
        String oper;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.print("Enter operation sing: ");
        oper = op.next();

        switch (oper) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + add(num1, num2) + "\n");
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2) + "\n");
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + mult(num1, num2) + "\n");
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + div(num1, num2) + "\n");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    // calc methods
    public static int add(int x, int y) {
        int res = x + y;
        return res;
    }

    public static int sub(int x, int y) {
        int res = x - y;
        return res;
    }

    public static int mult(int x, int y) {
        int res = x * y;
        return res;
    }

    public static double div(int x, int y) {
        double a = (double) x;
        double b = (double) y;
        double res = a / b;
        return res;
    }
}
