package TASKS_OOP.Java_SuperCalc;

public class MathModel extends CalcModel {

    public MathModel() {
    }

    public String result() {
        switch (oper) {
            case "+":
                return (x + " + " + y + " = " + add(x, y) + "\n");
            case "-":
                return (x + " - " + y + " = " + sub(x, y) + "\n");
            case "*":
                return (x + " * " + y + " = " + mult(x, y) + "\n");
            case "/":
                return (x + " / " + y + " = " + div(x, y) + "\n");
            default:
                return ("Invalid input");
        }
    }

    public double add(double x, double y) {
        double res = x + y;
        return res;
    }

    public double sub(double x, double y) {
        double res = x - y;
        return res;
    }

    public double mult(double x, double y) {
        int result = (int) Math.round(((x * y) * 100));
        double res = (double) result / 100;
        return res;
    }

    public double div(double x, double y) {
        int result = (int) Math.round(((x / y) * 100));
        double res = (double) result / 100;
        return res;
    }

    @Override
    public void setOper(String value) {
        super.oper = value;

    }

    @Override
    public void setX(Double value) {
        super.x = value;

    }

    @Override
    public void setY(Double value) {
        super.y = value;

    }

}
