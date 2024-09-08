package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> practice) {
        int total = 0;
        for (int number : practice) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> practice = new ArrayList<>();
        practice.add(2);
        practice.add(5);
        practice.add(7);
        practice.add(9);
        practice.add(4);
        practice.add(2);
        practice.add(6);
        practice.add(10);
        practice.add(3);
        practice.add(1);

        int total = sumEven(practice);
        System.out.println(total);
    }
}