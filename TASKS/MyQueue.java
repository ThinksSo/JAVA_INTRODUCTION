package TASKS;

import java.util.Iterator;
import java.util.LinkedList;

public class MyQueue {
    private static LinkedList<Object> list;

    MyQueue() {
        list = new LinkedList<>();
    }

    public static boolean empty() {
        return list.isEmpty();
    }

    static Object reverse(LinkedList<Object> list) {
        LinkedList<Object> newList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    public static void enqueue(LinkedList<Object> list, Object el) {
        list.addLast(el);
    }

    public static Object dequeue(LinkedList<Object> list) {
        return list.removeFirst();
    }

    public static Object first(LinkedList<Object> list) {
        return list.get(0);
    }

    static int sumList(LinkedList<Object> list) {
        Iterator<Object> i = list.iterator();
        int sun = 0;
        while (i.hasNext()) {
            Object integer = i.next();
            sun += (int)integer;
        }
        return sun;
    }
}
