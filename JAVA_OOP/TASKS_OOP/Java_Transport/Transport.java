package TASKS_OOP.Java_Transport;

/* Создать иерархию родительский и дочернии классы для Транспорта 
Например Транспорт - > Автомобиль - > Автобус 
Транспорт - > Автомобиль - > Легковой
Используем наследование, инкапсуляцию
 */

public abstract class Transport {
    private int id;
    private static int counter = 1;

    Transport() {
        id = counter++;
    }

    // public String toString() {
    // return type;
    // }

    public void displayID() {
        System.out.println("Id: " + id);
    }

    public static void displayCounter() {
        System.out.println("Counter: " + counter);
    }
}
