package TASKS_OOP.Java_Calc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// Создать клиент-серверный калькулятор для работы с вещественными числами.
// Вычисление должно быть на сервере. Принимаем выражение для вычисления от пользователя на клиенте. 

public class clientApp {
    public static void main(String[] args) {
        System.out.println("\n\t Server Calculator selection \n");

        Scanner scanner = new Scanner(System.in);
        String request;

        try {
            Socket socket = new Socket("localhost", 2233);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                System.out.print("Enter the equation through a space (number operation number): ");
                request = scanner.nextLine();
                dataOutputStream.writeUTF(request);
                if ("end".equals(request))
                    break;
                // System.out.println("Received a response from the server: " +
                // dataInputStream.readUTF());
                System.out.println(dataInputStream.readUTF());
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
