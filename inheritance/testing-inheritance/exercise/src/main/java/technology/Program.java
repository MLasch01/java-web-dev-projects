package technology;
import technology.Computer;
import technology.Laptop;
import technology.SmartPhone;

import org.launchcode.MenuItem;

public class Program {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Alienware", "Aurora R16", 1000);
        Laptop laptop1 = new Laptop("Asus", "Vivobook", 512, 14.11);
        SmartPhone smartPhone1 = new SmartPhone("Apple", "iPhone 13 Pro Max", 256,8.46);

        Computer.freeStorage();
//        Computer.noVirusDetected();

        Laptop.freeStorage();
//        Laptop.noVirusDetected();
        Laptop.hasCamera();

        SmartPhone.freeStorage();
//        SmartPhone.noVirusDetected();
        SmartPhone.setOnDoNotDisturb();
    }
}
