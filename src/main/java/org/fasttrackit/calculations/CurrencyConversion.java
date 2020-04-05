package org.fasttrackit.calculations;

import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many euros are you exchanging? ");
        double eurosExchange = scanner.nextDouble();
        System.out.println("What is the exchange rate? ");
        double rateTo = 1.08;
        double exchangeRate = scanner.nextDouble();
        double amountTo = eurosExchange*exchangeRate/rateTo;
        System.out.println(eurosExchange + " euros at an exchange rate of " +  exchangeRate + " is " + amountTo + " U.S dollars");




    }
}
