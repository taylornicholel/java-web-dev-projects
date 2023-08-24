package org.launchcode;

import java.util.Scanner;

// java.util.Scanner

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius of " + radius + " is " + area);
        input.close();
    }
}
