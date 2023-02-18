package TASKS_OOP.Java_Transport;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n \t Transport");
        
        Passenger car1 = new Passenger("Electro", "Audi", 2021, "grey");
        Passenger car2 = new Passenger("Gasoline", "BMW", 2015, "darkblue");
        Passenger car3 = new Passenger("Disel", "Mersedes", 2019, "black");
        Bus bus1 = new Bus("Disel", 40, "Neoplan");
        Bus bus2 = new Bus("Electro", 50, "Scania");

    
        System.out.print(car1.toString() + ", ");
        car1.displayID();
        System.out.print(car1.getModel());
        car1.isMove();

        car2.setMove(true);
        System.out.print(car2.getModel());
        car2.isMove();
        System.out.println("");

        System.out.print(car3.getModel() + ", ");
        car3.displayID();
        System.out.print(car3.getModel() + " engin type: ");
        System.out.println(car3.getType());
        System.out.println("-----------------------");

        System.out.print(bus1.toString() + ", ");
        bus1.displayID();
        System.out.println(bus1.getModel() + " capacity = " + bus1.getCapacity() + " prs");

        System.out.println("");
    }
}
