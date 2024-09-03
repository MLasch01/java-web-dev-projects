package org.launchcode;

import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed");
        Double gallons = input.nextDouble();
        input.close();

        System.out.println("Your gas mileage is: " + miles/gallons + "MPG");
    }
}
