package org.fasttrackit.calculations;

import java.util.Scanner;

public class DeterminingCompoundInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the principal amount? ");
        int principalAmount = scanner.nextInt();
        System.out.println("What is the rate? ");
        double rate = scanner.nextDouble();
        System.out.println("What is the number of years? ");
        int numberOfYears = scanner.nextInt();
        System.out.println("What is the number of times the interest is compound per year? ");
        int compoundPerYear = scanner.nextInt();
        double compoundInterest = principalAmount*Math.pow((1+(rate/100)/compoundPerYear),(compoundPerYear*numberOfYears));

        System.out.println("$" + principalAmount +  " invested at " + rate + " % " + " for " + numberOfYears + " years compounded" + compoundPerYear + " times per year " + compoundInterest);

    }
}
