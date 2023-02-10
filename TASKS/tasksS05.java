package TASKS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class tasksS05 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Task 1. Реализуйте структуру телефонной книги с помощью HashMap,
         * учитывая, что 1 человек может иметь несколько телефонов.
         */
        System.out.println("\n\t Task 1: HashMap");
        Map<String, List<String>> phonebook = new HashMap<>();
        addContact(phonebook);
        System.out.println("\n Phonebook:");
        for (Map.Entry<String, List<String>> pair : phonebook.entrySet()) {
            System.out.println(pair.getKey() + ": \t" + pair.getValue());
        }

        /*
         * Task 2. Пусть дан список сотрудников:
         * Иван Иванов, Светлана Петрова, Кристина Белова,
         * Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр
         * Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина
         * Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
         * Написать программу, которая найдет и выведет повторяющиеся имена с
         * количеством повторений. Отсортировать по убыванию популярности.
         * Для сортировки использовать TreeMap.
         */
        System.out.println("\n\t Task 2: TreeMap \n");

        String names = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, " +
                "Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, " +
                "Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, " +
                "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] emplList = names.split(", ");
        System.out.println(names.toString());
        System.out.println("--------------------------------------");

        TreeMap<String, List<String>> treeMap = new TreeMap<String, List<String>>();

        for (String string : emplList) {
            String[] s = string.split(" ");
            if (treeMap.containsKey(s[0])) {
                List<String> employees = treeMap.get(s[0]);
                employees.add(s[1]);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(s[1]);
                treeMap.put(s[0], employees);
            }
        }
        System.out.println(treeMap);
        System.out.println("--------------------------------------");

        TreeMap<String, List<String>> newMap = new TreeMap<String, List<String>>();
        newMap = treeMapSort(treeMap);
        // System.out.println(newMap);
        // System.out.println("------------------------------------");

        for (Map.Entry<String, List<String>> pair : newMap.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println("");
    }

    static void addContact(Map<String, List<String>> phonebook) {
        String name = "";
        String phone = "";
        while (true) {
            System.out.print("Please enter contact name or end for exit: ");
            name = scanner.nextLine().toLowerCase();
            if (phone.equals("end") || name.equals("end") || name.equals("exit"))
                break;
            if (phonebook.containsKey(name)) {
                List<String> list = phonebook.get(name);
                list.add(phoneAdd());
            } else {
                List<String> list = new ArrayList<>();
                list.add(phoneAdd());
                phonebook.put(name, list);
            }
        }
    }

    static String phoneAdd() {
        System.out.print("Please enter phone number: ");
        String phone = scanner.nextLine();
        return (phone);
    }

    public static TreeMap<String, List<String>> treeMapSort(TreeMap<String, List<String>> anyTreeMap) {
        TreeMap<String, List<String>> treeMapNew = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for (Entry<String, List<String>> item : anyTreeMap.entrySet()) {
            String newKey = item.getValue().size() + " " + item.getKey();
            treeMapNew.put(newKey, item.getValue());
        }
        anyTreeMap = treeMapNew;
        return (anyTreeMap);
    }

}
