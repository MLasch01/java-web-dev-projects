package org.launchcode;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            try {
                int points = CheckFileExtension(fileName);
                System.out.println(student + ": " + points);
            } catch (IllegalAccessException e) {
                System.out.println(student + ": " + e.getMessage());
            }
        }
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        int result = x/y;
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by 0.  Please enter a valid number.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        System.out.println(result);
    }

    public static int CheckFileExtension(String fileName) throws IllegalAccessException {
        // Write code here!
        if(fileName == null || fileName.isEmpty()) {
        throw new IllegalAccessException("-1.  File Name is empty.");
    }
    if (fileName.endsWith(".java")) {
        return 1;
    } else {
        return 0;
    }
    }
}