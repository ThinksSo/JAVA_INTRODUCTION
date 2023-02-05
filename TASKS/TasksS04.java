package TASKS;

import java.util.LinkedList;
import java.util.Random;

public class TasksS04 {
    public static void main(String[] args) {

        // Task 1. Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод, который вернет “перевернутый” список.
        System.out.println("\n\t Task 1: Reverse");

        LinkedList<Object> anyList = new LinkedList<>();
        randomList(anyList, 9);
        System.out.println(anyList);
        System.out.println(MyQueue.reverse(anyList));

        // Task 2. Реализуйте очередь с помощью LinkedList со следующими методами:
        // enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.
        System.out.println("\n\t Task 2: Methods enqueue, dequeue, first");

        System.out.println("LinkedList" + "\t" + anyList);
        MyQueue.enqueue(anyList, 12);
        MyQueue.enqueue(anyList, 48);
        MyQueue.enqueue(anyList, 133);
        System.out.println("enqueue: " + "\t" + anyList);
        System.out.println("dequeue: " + MyQueue.dequeue(anyList) + "\t" + anyList);
        System.out.println("first: " + MyQueue.first(anyList) + "\t" + anyList);

        // Task 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в
        // списке. Используйте итератор
        System.out.println("\n\t Task 3: Sum LinkedList");
        System.out.println("Sum " + anyList + " = " + MyQueue.sumList(anyList));
        System.out.println();
    }

    static void randomList(LinkedList<Object> arrayList, int arLength) {
        Random random = new Random();
        for (int i = 0; i < arLength; i++) {
            arrayList.add(random.nextInt(arLength));
        }
        return;
    }
}
