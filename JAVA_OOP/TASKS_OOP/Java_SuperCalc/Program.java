package TASKS_OOP.Java_SuperCalc;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        System.out.println("\n\t Calculator \n");
        Presenter p = new Presenter(new MathModel(), new View());

        try {
            p.startCalc();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
