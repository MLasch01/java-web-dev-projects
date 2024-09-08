package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice2 {

//    public static void fiveLetters(ArrayList<String> practice2) {
//        for (String word : practice2) {
//            if (word.length() == 5) {
//                System.out.println(word);
//            }
//        }
//    }

    public static void userSearch(ArrayList<String> practice2, int numChars) {
        for (String word : practice2) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<String> practice2 = new ArrayList<>();
            practice2 = new ArrayList<>();
            practice2.add("Hello");
            practice2.add("World");
            practice2.add("Help");
            practice2.add("Me");
            practice2.add("I'm");
            practice2.add("Scared");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word length to search: ");
            int numChars = input.nextInt();


            System.out.println(numChars);
            userSearch(practice2, numChars);

            input.close();
    }
}