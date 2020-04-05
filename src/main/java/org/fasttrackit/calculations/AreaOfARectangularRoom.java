package org.fasttrackit.calculations;

import java.util.Scanner;

public class AreaOfARectangularRoom {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        int length = scanner.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width = scanner.nextInt();
        double feetX2 = length * width;
        double area = length * width;
        double meters = feetX2 * 0.09290304;
        System.out.println("Area of the room is " + "\n" + area + "square feet" + "\n" + meters + "square meters" );
}

}