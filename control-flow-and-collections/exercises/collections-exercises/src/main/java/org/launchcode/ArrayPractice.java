package org.launchcode;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8};

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("");

        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.println(i);
                continue;
            }
        }

        System.out.println("");

        String eggsAndHam = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                " will not eat them with a mouse.";
        String[] eggsAndHamArray = eggsAndHam.split ("\\.");
        System.out.println(Arrays.toString(eggsAndHamArray));

    }
}
