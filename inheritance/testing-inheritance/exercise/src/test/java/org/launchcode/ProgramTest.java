package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import technology.Computer;
import technology.Laptop;
import technology.SmartPhone;
import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
    Computer test_computer;
    Laptop test_laptop;
    SmartPhone test_smartPhone;

//    TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }


    @BeforeEach
    public void initComputer() {
        test_computer = new Computer("Alienware", "Aurora R16", 1000);
    }
    @Test()
    public void storageAvailable() {
        assertThrows(IllegalArgumentException.class, () -> test_computer.freeStorage(1000),
                "Shouldn't get here, storage cannot have more GB than capacity limit.");
    }
    @Test()
    public void storageFull() {
        assertThrows(IllegalArgumentException.class, () -> test_computer.freeStorage(1000),
                "Shouldn't get here, storage cannot have more GB than capacity limit.");
    }
    @Test
    public void testInitialStorage() {
        assertEquals(1000, test_computer.freeStorage(), .001);
//            assertEquals( 10, test_car.getGasTankLevel(),.001);
    }


    @BeforeEach
    public void initLaptop() {
        test_laptop = new Laptop("Asus", "Vivobook", 512, 14.11);
    }
    @Test
    public void testCamera() {
        assertEquals("This laptop has a built in web camera.", test_laptop.hasCamera);


    @BeforeEach
    public void initSmartPhone() {
        test_smartPhone = new SmartPhone("Apple", "iPhone 13 Pro Max", 256,8.46);
    }


}
