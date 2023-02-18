package TASKS_OOP.Java_Transport;

public class Bus extends Auto{
    int capacity;
    String model;
    
    public Bus(String type, int capacity, String model) {
        super(type);
        this.capacity = capacity;
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return model;
    }
    
}
