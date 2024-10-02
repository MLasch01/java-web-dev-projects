package org.launchcode;

public class Main {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem( "Poutina Turner",15.00, "Rock Star Dusted fries topped with cheddar cheese curds, chorizo gravy (or make it vegetarian!), onions, and cilantro", "Appetizer", true);
        MenuItem item2 = new MenuItem( "Shrimp Bizkit",5.25, "pan-seared shrimp, peppers and onions", "Main Course", true);
        MenuItem item3 = new MenuItem( "Goonies Are Good",16.00, "Gigantic quesadilla, stuffed with crab Rangoon filling, and served up with a spicy sweet chili sauce", "Main Course", true);
        MenuItem item4 = new MenuItem( "Bread Michaels",7.00, "Hawaiian bread pudding, topped with caramel and sea salt", "Dessert", true);

        // write your code here
//        System.out.println(item1.isNew());
        System.out.println(item1);

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);

        System.out.println(menu);

        menu.removeItem(item3);
        System.out.println(menu);
    }
}
