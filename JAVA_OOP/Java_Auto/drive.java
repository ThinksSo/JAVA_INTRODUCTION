package Java_Auto;

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
        if (car1.year > car2.year) {
            score2++;
        }
        if (car1.year < car2.year) {
            score1++;
        }
        if (car1.price > car2.price) {
            score2++;
        }
        if (car1.price < car2.price) {
            score1++;
        }
        if (car1.power > car2.power) {
            score1++;
        }
        if (car1.power < car2.power) {
            score2++;
        }
        if (car1.acceleration > car2.acceleration) {
            score2 += 3;
        }
        if (car1.acceleration < car2.acceleration) {
            score1 += 3;
        }

        if (score1 > score2) {
            System.out.println(
                    car1.model + " " + car1.carNumber + ", score " + score1 + " spec looks better " + car2.model + " "
                            + car2.carNumber + ", score " + score2);
        } else if (score1 < score2) {
            System.out.println(
                    car2.model + " " + car2.carNumber + ", score " + score2 + " spec looks better " + car1.model + " "
                            + car1.carNumber + ", score " + score1);
        } else {
            System.out.println(
                    car1.model  + " " + car1.carNumber + " and " + car2.model + car2.carNumber + " spec looks the same");
        }
        System.out.println("-------------------------");

    }

}
