package TASKS_OOP.Java_SuperCalc;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);


    public String getValue(String title) {
        System.out.printf("%s", title);
        return scanner.nextLine();
    }

    public void print(String result) {
        System.out.println(result);
    }



}
