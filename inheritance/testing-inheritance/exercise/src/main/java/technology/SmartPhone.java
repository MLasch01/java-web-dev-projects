package technology;

public class SmartPhone extends Computer{
    private double weight;

    public SmartPhone(String aMake, String aModel, double aMemory, double aWeight) {
        super(aMake, aModel, aMemory);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void setOnDoNotDisturb(){
        System.out.println("User has set this phone on 'Do not disturb' mode.");
    }
}
