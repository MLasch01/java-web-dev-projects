package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private String item;
    private double price;
    private String description;
    private String category;
    private final LocalDate lastUpdate;

    public MenuItem(LocalDate lastUpdate, String category, String description, double price, String item) {
        this.lastUpdate = LocalDate.now();
        this.category = category;
        this.description = description;
        this.price = price;
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

//    Print Item
    Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" + description + " | $" + price;
    }

    Override
    public String toString() {
        StringBuilder appetizers = new String Builder();
        for (MenuItem item; menueItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new String Builder();
        for (MenuItem item; menueItems) {
            if (item.getCategory().equals("main course")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new String Builder();
        for (MenuItem item; menueItems) {
            if (item.getCategory().equals("desser")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        return "|nRock Star Tacos Menu\n" +
                "Appetizers" + appetizers.toString() + "\n" +
                "Main Courses" + mainCourses.toString() + "\n" +
                "Desserts" + desserts.toString() + "\n" +
    }



    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysSinceAdded = getLastUpdate().until(today, ChronoUnit.DAYS);
        return daysSinceAdded < 90;
    }
}

