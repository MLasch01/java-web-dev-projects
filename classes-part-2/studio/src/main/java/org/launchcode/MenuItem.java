package org.launchcode;

public class MenuItem {
    private String item;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String i, double p, String d, String c, boolean iN) {
        this.item = i;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

