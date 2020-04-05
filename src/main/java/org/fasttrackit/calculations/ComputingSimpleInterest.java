package org.fasttrackit.calculations;

import java.util.Scanner;

public class ComputingSimpleInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int principal = scanner.nextInt();
        System.out.println("Enter the rate of interest: ");
        double rateOfInterest = scanner.nextDouble();
        System.out.println("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();
        double simpleInterest = principal*(1+ (rateOfInterest/100)*numberOfYears);
        System.out.println("After " + numberOfYears + "years at " + rateOfInterest + "%, the investment will be worth $ " + simpleInterest);


    }
}
