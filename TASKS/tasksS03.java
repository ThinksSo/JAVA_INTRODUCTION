package TASKS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class tasksS03 {
    public static void main(String[] args) {
        // Task 1. Пусть дан произвольный список целых чисел,
        // удалить из него четные числа
        System.out.println("\n\t Task 1: Remove even numbers");

        List<Integer> list = new LinkedList<>();
        randomList(list, 9);
        System.out.println(list);

        evenRemove(list);
        System.out.println(list);

        // Task 2. Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее арифметическое из этого списка.
        // Collections.max()
        System.out.println("\n\t Task 2: Min-max, average");

        ArrayList<Integer> arrayList = new ArrayList<>();
        randomList(arrayList, 9);
        System.out.println(arrayList);
        System.out.println("Max = " + Collections.max(arrayList));
        System.out.println("Min = " + Collections.min(arrayList));
        System.out.println("Average = " + average(arrayList));
        System.out.println();
    }

    static void randomList(List arrayList, int arLength) {
        Random random = new Random();
        for (int i = 0; i < arLength; i++) {
            arrayList.add(random.nextInt(arLength));
        }
        return;
    }

    static void evenRemove(List numList) {
        Iterator<Integer> i = numList.iterator();
        while (i.hasNext()) {
            Integer integer = i.next();
            if (integer % 2 == 0)
                i.remove();
        }
        return;
    }

    private static double average(List<Integer> numList) {
        Integer sum = 0;
        if (!numList.isEmpty()) {
            for (Integer num : numList) {
                sum += num;
            }
        }
        return sum / numList.size();
    }
}
