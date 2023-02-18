package TASKS_OOP.Java_Transport;

import java.util.ArrayList;
import java.util.List;

public class Passenger extends Auto {
    String model;
    int year;
    String color;

    public Passenger(String type, String model, int year, String color) {
        super(type);
        this.model = model;
        this.year = year;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Passenger [model=" + model + ", year=" + year + ", color=" + color + "]";
    }

}
