package TASKS.TasksS06;

import java.util.HashMap;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации 
и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ? 2 - Объем ЖД? 3 - Операционная система? 4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев 
- сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

public class Laptop {
    HashMap<Integer, String> comp;

    public Laptop(String name, String cpu, String ram, String hdd, String os, String color) {
        comp = new HashMap<>();
        comp.put(0, name);
        comp.put(1, cpu);
        comp.put(2, ram);
        comp.put(3, hdd);
        comp.put(4, os);
        comp.put(5, color);
        // this.name = name;
        // this.cpu = cpu;
        // this.ram = ram;
        // this.hdd = hdd;
        // this.os = os;
        // this.color = color;

    }

    public String toString() {
        return comp.get(0) + ": CPU " + comp.get(1)
                + "; RAM " + comp.get(2) + "GB; " + "HDD " + comp.get(3) + "GB; "
                + "OS " + comp.get(4) + "; color " + comp.get(5);
    }

    public Object get(int i) {
        return comp.get(i);
    }



}
