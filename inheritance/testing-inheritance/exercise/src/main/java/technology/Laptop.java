package technology;

public class Laptop extends Computer{
    private double screenSize;

    public Laptop(String aMake, String aModel, double aMemory, double aScreenSize) {
        super(aMake, aModel, aMemory);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public static void hasCamera(){
        System.out.println("This laptop has a built in web camera.");
    }
}
