package org.launchcode;

public abstract class Data extends Disc {
    private double capacity;

    public Data(String name, String discType, int spinSpeed, double capacity) {
        super(name, discType, spinSpeed);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Capacity: " + capacity + " MB" + newline;
    }


}
