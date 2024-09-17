package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdate;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
