package org.fasttrackit.calculations;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length?");
        int length = scanner.nextInt();
        System.out.println("What is the width?");
        int width = scanner.nextInt();
        int oneGallonCovers = 350;
        int area = length * width;

        System.out.println("You will need to purchase " + ((area/oneGallonCovers) + 1) + " gallons of paint to cover" + area + "square feet");
    }
}
