package TASKS_OOP.Java_Transport;

public class Auto extends Transport {
    /**
     * type: gasoline, disel, electro, muscular
     */
    private String type;
    boolean move;
    // List<Auto> cars;

    Auto(String type) {
        this.type = type;
        this.move = false;
        // cars = new ArrayList<>();
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void displayID() {
        // TODO Auto-generated method stub
        super.displayID();
    }

    public String getType() {
        return type;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    // public void addCars(Auto obj) {
    //     cars.add(obj);
    // }

    public void isMove() {
        if (move) {
            System.out.println(" is moving");
        } else {
            System.out.println(" is stopped");
        }
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Auto []";
    }
}
