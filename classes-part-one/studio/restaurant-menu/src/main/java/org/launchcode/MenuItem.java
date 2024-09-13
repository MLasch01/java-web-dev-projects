package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private String item;
    private double price;
    private String description;
    private String category;
    private final LocalDate lastUpdate;

    public MenuItem(LocalDate lastUpdate, String category, String description, double price, String item) {
        this.lastUpdate = lastUpdate;
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
}
