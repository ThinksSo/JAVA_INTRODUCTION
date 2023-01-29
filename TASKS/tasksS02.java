package TASKS;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class tasksS02 {
    public static void main(String[] args) {

        /*
         * Task 1: Дана json строка
         * Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
         * Студент Иванов получил 5 по предмету Математика.
         * Используйте StringBuilder для подготовки ответа.
         */

        System.out.println("\n\t Task 1: Strings pars");
        String json = "{[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]}";
        System.out.println(json + "\n");
        json = json.substring(2, json.length() - 3);
        String[] students = json.split("},");

        strPars(students);

        // Task 2. Создать метод, который запишет результат работы в файл
        // Обработайте исключения и запишите ошибки в лог файл.
        System.out.println("\n\t Task 2: File logging");
        logFile(students);
        System.out.println("exceptions.log \n");
    }

    static void strPars(String[] anyString) {
        for (int i = 0; i < anyString.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            ArrayList<String> arrayList = new ArrayList<>();
            String[] data = anyString[i].replace("{", "").split(",");

            for (int j = 0; j < data.length; j++) {
                String[] newData = data[j].split(":");
                arrayList.add(newData[1].replace("\"", ""));
            }
            stringBuilder.append("Студент " + arrayList.get(0) + " получил(а) " + arrayList.get(1)
                    + " по предмету " + arrayList.get(2));
            System.out.println(stringBuilder.toString());
            System.out.println();
        }
    }

    static void logFile(String arg[]) {
        PrintWriter log;
        FileWriter logFile;
        SimpleFormatter formatter = new SimpleFormatter();
        FileHandler fileHandler = null;
        try {
            logFile = new FileWriter("exceptions.log", true);
            log = new PrintWriter((java.io.Writer) logFile);
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
        try {
            fileHandler = new FileHandler("exceptions.log");
            fileHandler.setFormatter(formatter);
            throw new Exception();
        } catch (Exception ex) {
            log.printf("\n%s: %s\n", LocalDateTime.now(), ex.getMessage());
            ex.printStackTrace(log);
            log.flush();
        }
    }
}
