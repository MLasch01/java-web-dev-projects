package main.java.org.launchcode;

public abstract class Disc {

    private static int nextId = 1;

    private final int id;
    private String name;
    private String discType;
    private int spinSpeed; //rpm

    public Disc(String name, String discType, int spinSpeed) {
        this.id = nextId;
        this.name = name;
        this.discType = discType;
        this.spinSpeed = spinSpeed;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        String asterisks = "*****";
        return newline +  asterisks + " " + name + " " + asterisks + newline +
                "ID" + id + newline +
                "Disc Type: " + discType + newline +
                "Spin Speed: " + spinSpeed + newline + " RPM" + newline;
    }

    void spinDisc() {
        System.out.println("The" + discType + " " + name + " is spinning at " + spinSpeed + " RPM.");
    }
}
