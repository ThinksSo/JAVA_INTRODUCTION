package TASKS_OOP.Java_Auto;

import java.util.ArrayList;

public class drive {
    public static void main(String[] args) {
        System.out.println("\n \t Cars");

        Car car1 = new Car("Audi", 2018, 20000, "grey", 3, 7.5, "A234AA00");
        Car car2 = new Car("BMW", 2015, 15000, "darkblue", 2, 8.5, "B345BB00");
        Car car3 = new Car("Mersedes", 2019, 25000, "black", 2.8, 8.0, "M567MM00");
        Car anyCar = new Car("AnyCar", 2018, 20000, "grey", 3, 7.5, "X000XX00");

        Car[] cars = { car1, car2, car3 };
        ArrayList<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < cars.length; i++) {
            carList.add(i, cars[i]);
        }

        System.out.println("========================= ");
        printAll(carList);
        System.out.println("=========================");
        car1.enginOn();
        car1.driveTo("Amsterdam");
        car2.driveTo("Paris");
        carsCompare(car1, car2);
        carsCompare(car2, car3);
        carsCompare(car1, anyCar);

        System.out.println("");
    }

    private static void printAll(ArrayList<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    public static void carsCompare(Car car1, Car car2) {
        // for (int i = 0; i < car1.getClass().getDeclaredFields().length; i++) {
        // }
        System.out.println("-------------------------");
        int score1 = 0;
        int score2 = 0;
        if (car1.getYear() > car2.getYear()) {
            score2++;
        }
        if (car1.getYear() < car2.getYear()) {
            score1++;
        }
        if (car1.getPrice() > car2.getPrice()) {
            score2++;
        }
        if (car1.getPrice() < car2.getPrice()) {
            score1++;
        }
        if (car1.getPower() > car2.getPower()) {
            score1++;
        }
        if (car1.getPower() < car2.getPower()) {
            score2++;
        }
        if (car1.getAcceleration() > car2.getAcceleration()) {
            score2 += 3;
        }
        if (car1.getAcceleration() < car2.getAcceleration()) {
            score1 += 3;
        }

        if (score1 > score2) {
            System.out.println(
                    car1.getModel() + " " + car1.getCarNumber() + ", score " + score1 + " spec looks better "
                            + car2.getModel() + " "
                            + car2.getCarNumber() + ", score " + score2);
        } else if (score1 < score2) {
            System.out.println(
                    car2.getModel() + " " + car2.getCarNumber() + ", score " + score2 + " spec looks better "
                            + car1.getModel() + " "
                            + car1.getCarNumber() + ", score " + score1);
        } else {
            System.out.println(
                    car1.getModel() + " " + car1.getCarNumber() + " and " + car2.getModel() + car2.getCarNumber()
                            + " spec looks the same");
        }
        System.out.println("-------------------------");

    }

}
