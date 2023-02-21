package TASKS_OOP.Java_Auto;

/* TASK S1
 * 1) Напишите класс Car. В классе должна храниться следующая информация:
название автомобиля - model;
год выпуска - year;
стоимость - price;
цвет - color;
объем двигателя - power.

2) Доработайте класс Car. 
Добавьте в класс Car метод getInfo без параметров, 
который будет печать на экране значения полей объекта класса model , power и yeare.

3) Доработайте класс Car. В классе должна храниться следующая информация:
Свойство - которое говорит заведен авто или нет
Метод - запуска автомобиля
Метод - остановки автомобиля
Метод дороги - при вызове, в качестве аргумента передаем место назначения
И если авто заведён - выводим, что мы на такой-то авто едем место назначения
Если не заведён - сообщить, что авто не заведено. И мы не можем ехать

4) Доработайте программу в свободном стиле.
Можно сравнить 2 автомобиля между собой
Или пусть авто заедет за фруктами :-)
Добавьте несколько произвольных методов и свойств
 */

// TASK S2 Переписать прошлое задание с использованием принципа инкапсуляции

public class Car {
    private String model;
    private int year;
    private int price;
    private String color;
    private double power;
    private double acceleration;
    private String carNumber;
    boolean engin;

    /**
     * @param model
     * @param year
     * @param price
     * @param color
     * @param power
     * @param carNumber A123AA45
     * @param engin
     * @param acceleration up to 100 km/h
     */
    
    public Car(String model, int year, int price, String color, double power, double acceleration, String carNumber) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.acceleration = acceleration;
        this.carNumber = carNumber;
        this.engin = false;
    }


    public void getInfo() {
        System.out.println(carNumber + " " + model + ", year " + year + ", $" + price + ", " + color + ", " + power
                + "l, " + acceleration + " sec. to km/h");
    }

    public String toString() {
        return carNumber + " " + model + ", year " + year + ", $" + price + ", " + color + ", " + power
                + "l, " + acceleration + " sec. to km/h";
    }

    void enginOn() {
        this.engin = true;
        System.out.println("Car " + this.model + " " + this.carNumber + " is started");
    }

    void enginOff() {
        this.engin = false;
        System.out.println("Car " + this.model + " " + this.carNumber + " is stopped");
    }

    public void enginStatus() {
        if (!this.engin) {
            enginOn();
            System.out.println("Car " + this.model + " " + this.carNumber + " is started");
        } else {
            enginOff();
            System.out.println("Car " + this.model + " " + this.carNumber + " engin not running");
        }
    }

    public void driveTo(String place) {
        if (!this.engin) {
            System.out
                    .println("Car " + this.model + " " + this.carNumber + " engin not running, dosn't go to " + place);
        } else {
            System.out.println("Car " + this.model + " " + this.carNumber + " go to " + place);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public boolean isEngin() {
        return engin;
    }

    public void setEngin(boolean engin) {
        this.engin = engin;
    }

}
