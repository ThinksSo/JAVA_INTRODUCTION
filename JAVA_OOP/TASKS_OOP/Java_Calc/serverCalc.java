package TASKS_OOP.Java_Calc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class serverCalc {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(2233)) {
            System.out.println("Server is running, waiting for connection ...");
            Socket socket = serverSocket.accept();
            System.out.println("Client is connected");
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String clientRequest = dataInputStream.readUTF();
                if ("end".equals(clientRequest))
                    break;
                System.out.println("Recived: " + clientRequest);
                dataOutputStream.writeUTF("Server calculated: " + calcResponse(clientRequest));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String calcResponse(String clientRequest) {
        String[] equation = clientRequest.split(" ");
        double num1 = Double.parseDouble(equation[0]);
        String oper = equation[1];
        double num2 = Double.parseDouble(equation[2]);

        switch (oper) {
            case "+":
                return (num1 + " + " + num2 + " = " + add(num1, num2) + "\n");
            case "-":
                return (num1 + " - " + num2 + " = " + sub(num1, num2) + "\n");
            case "*":
                return (num1 + " * " + num2 + " = " + mult(num1, num2) + "\n");
            case "/":
                return (num1 + " / " + num2 + " = " + div(num1, num2) + "\n");
            default:
                return ("Invalid input");
        }
    }

    // calc methods
    public static double add(double x, double y) {
        double res = x + y;
        return res;
    }

    public static double sub(double x, double y) {
        double res = x - y;
        return res;
    }

    public static double mult(double x, double y) {
        int result = (int) Math.round(((x * y) * 100));
        double res = (double) result / 100;
        return res;
    }

    public static double div(double x, double y) {
        int result = (int) Math.round(((x / y) * 100));
        double res = (double) result / 100;
        return res;
    }
}
