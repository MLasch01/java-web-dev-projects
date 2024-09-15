package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItemsArrayList = new ArrayList<>();
    private LocalDate lastUpdate;

    public Menu(ArrayList<MenuItem> menuItemsArrayList) {
        this.menuItemsArrayList = menuItemsArrayList;
    }
}
