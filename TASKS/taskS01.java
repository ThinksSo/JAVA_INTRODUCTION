package TASKS;

import java.util.Scanner;

public class taskS01 {
    public static void main(String[] args) {

        // Tasak 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)
        System.out.println("\n\t Task 1: Calculate the nth triangular number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.println("Sum (" + n + ") = " + sumN(n));


        // Tasak 2. Вычислить n! (произведение чисел от 1 до n)
        System.out.println("\n\t Task 2: Factorial");
        System.out.println("Factorial (" + n + ") = " + getFactorial(n));

        // Tasak 3. Вывести все простые числа от 1 до 1000
        System.out.println("\n\t Task 3: Prime numbers");
        primeNum();

        /*
         * Tasak 4. Реализовать простой калькулятор
         * ("введите первое число"... "Введите второе число"... "
         * укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
         */
        System.out.println("\n\t Task 4: Calc");
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

    static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    static void primeNum() {
        int num = 1000;
        boolean isPrime = false;

        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            } else {
                isPrime = true;
            }
        }
        System.out.println("");
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
