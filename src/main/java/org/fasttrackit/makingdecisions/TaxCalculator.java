package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class TaxCalculator {

        public static double tax = 5.5;
        public static String WI = "WI";
        public static String MN ="MN";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?  ");
        double amount = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is the state? ");
        String state = scanner1.nextLine();

        if (state.equals(WI)) {
            System.out.println("The subtotal is $" + amount + ".");
            System.out.println("The tax is: " + (tax / 100) * amount);
            System.out.println("The total is: " + (amount + (tax / 100) * amount));

       }

        else if (state.equals(MN)) {
            System.out.println("The total is $" + amount + ".");
       }
    }
}
