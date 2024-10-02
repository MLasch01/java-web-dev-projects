package technology;

import java.lang.reflect.Constructor;

//Add 3 Properties
public class Computer {
    private String make;
    private String model;
    private double memory;

//    Add 1 Constructor
    public Computer(String make, String model, double memory) {
        this.make = make;
        this.model = model;
        this.memory = memory;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }


    //    Add 2 Methods
//    public static void freeStorage(double GB) {
//        this.setMemory(GB + this.getMemory());
//    }
//
//    public String noVirusDetected(){
//        return (this.make + model + "System Safe.  No viruses detected.");
//    }
}
