package TASKS_OOP.Java_SuperCalc;

import java.io.IOException;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void startCalc() throws IOException {
        while (true) {
            String response = view.getValue("Enter the equation through a space (number operation number): ");
            if (response.equals("end")) {
                System.out.println("");
                break;
            }

            String[] equation = response.split(" ");
            model.setX(Double.parseDouble(equation[0]));
            model.setY(Double.parseDouble(equation[2]));
            model.setOper(equation[1]);

            String result = model.result();
            view.print(result);
        }

    }
}
