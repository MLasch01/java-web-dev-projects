package main.java.org.launchcode;

public class DVD extends Data implements OpticalDisc {
    public DVD(String name) {
        super(name, "DVD", 1200, 4700);
    }

    @Override
    void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeFile() {

    }

    @Override
    public void removeFile() {

    }

    @Override
    public void reformatDisc() {

    }

    @Override
    public void runFile() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
