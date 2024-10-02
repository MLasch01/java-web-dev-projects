package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem item1 = new MenuItem(name: "Poutina Turner", description: "Rock Star Dusted fries topped with cheddar cheese curds, chorizo gravy (or make it vegetarian!), onions, and cilantro", price: 15.00, category: "Appetizer");
        MenuItem item2 = new MenuItem(name: "Shrimp Bizkit", description: "pan-seared shrimp, peppers and onions", price: 5.25, category: "Main Course");
        MenuItem item3 = new MenuItem(name: "Goonies Are Good", description: "Gigantic quesadilla, stuffed with crab Rangoon filling, and served up with a spicy sweet chili sauce", price: 16.00, category: "Main Course");
        MenuItem item4 = new MenuItem(name: "Bread Michaels", description: "Hawaiian bread pudding, topped with caramel and sea salt", price: 7.00, category: "Dessert");

        System.out.println(item1.isNew());

        System.out.println(item1);
    }
}
