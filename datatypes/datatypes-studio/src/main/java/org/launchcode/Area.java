package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter a radius:");
//        Double radius = input.nextDouble();
////        Double areaCircle = 3.14 * radius * radius;
//        Double areaCircle = Circle.getArea(radius);
//        input.close();
//
//        System.out.println("The area of the circle of radius " + radius + "is " + areaCircle);
//    }
//}


//        Bonus Mission 1:
//        System.out.println("Enter a radius:");
//
//        if (input.hasNextDouble()) {
//            Double radius = input.nextDouble();
//
//            if (radius > 0) {
//                Double areaCircle = Circle.getArea(radius);
//                System.out.println("The area of the circle of radius " + radius + "is " + areaCircle);
//            }
//            else {
//                    System.out.println("Radius must be a positive number.");
//                }
//        }
//        else {
//                System.out.println("Not a valid number");
//        }
//        input.close();
//    }
//}



//Bonus Mission 2:
            Double radius;

        do {
            System.out.println("Enter a positive number for the radius:");

             while (!input.hasNextDouble()) {
                System.out.println("The radius must be a positive number.  Please try again.");
                input.next();
             }
             radius = input.nextDouble();

        } while (radius < 0);

        Double areaCircle = Circle.getArea(radius);
        System.out.println("The area of the circle of radius " + radius + "is " + areaCircle);

        input.close();
    }
}
