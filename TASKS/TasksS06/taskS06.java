package TASKS.TasksS06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class taskS06 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t Laptops selection \n");

        Laptop comp1 = new Laptop("Dell", "Intel", "8", "1000", "Windows", "Silver");
        Laptop comp2 = new Laptop("HP", "Intel", "32", "512", "Windows", "White");
        Laptop comp3 = new Laptop("Asus", "AMD", "16", "512", "Linux", "DarkBlue");
        Laptop comp4 = new Laptop("Lenovo", "Intel", "8", "256", "Windows", "Black");
        Laptop comp5 = new Laptop("Macbook", "M1", "8", "1000", "MacOS", "DarkGray");

        Laptop[] computers = { comp1, comp2, comp3, comp4, comp5 };
        ArrayList<Laptop> compList = new ArrayList<Laptop>();
        for (int i = 0; i < computers.length; i++) {
            compList.add(i, computers[i]);
        }

        System.out.println("========================= ");
        printAll(compList);
        System.out.println("=========================");
 
        printAll(sort(request(), compList));
        System.out.println("");

    }

    public static Map<Integer, String> request() {
        Integer num;
        String options;
        HashMap<Integer, String> choise = new HashMap<Integer, String>();

        while (true) {
            System.out
                    .print("Please select option 1 - CPU, 2 - RAM, 3 - HDD, 4 - OS, or 0 for finish: ");
            num = scanner.nextInt();

            if (num == 0 || num < 0 || num > 6)
                break;
            
            switch (num) {
                case 1:
                    System.out.print("select options: Intel, AMD, M1: ");
                    options = scanner.next();
                    choise.put(num, options);
                    break;
                case 2:
                    System.out.print("select options: 8, 16, 32: ");
                    options = scanner.next();
                    choise.put(num, options);
                    break;
                case 3:
                    System.out.print("select options: 256, 512, 1000: ");
                    options = scanner.next();
                    choise.put(num, options);
                    break;
                case 4:
                    System.out.print("select options: Windows, Linux, MacOS: ");
                    options = scanner.next();
                    choise.put(num, options);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        return choise;
    }

    public static ArrayList<Laptop> sort(Map<Integer, String> map, ArrayList<Laptop> compList) {
        ArrayList<Laptop> selectComp = new ArrayList<Laptop>();
        System.out.println("-------------------------");
        for (Laptop comp : compList) {
            for (Integer key : map.keySet()) {
                if (map.get(key).equals(comp.get((Integer) key))) {
                    if (selectComp.contains(comp));
                    else {
                        selectComp.add(comp);
                    }
                } else {
                    if (selectComp.contains(comp)){
                        selectComp.remove(comp);
                    } else {
                        break;
                    }
                }
            }
        }
        return selectComp;
    }

    private static void printAll(ArrayList<Laptop> compList) {
        for (Laptop comp : compList) {
            System.out.println(comp);
        }
    }
}
