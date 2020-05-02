package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class TemperatureConverter {

    public static String Celsius = "C";
    public static String Fahrenheit = "F";

    public static void main(String[] args) {

        System.out.println("Press C to convert from Fahrenheit to Celsius " + "\n"+  "Press F to covert from Celsius to Fahrenheit ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: ");
        String choice = scanner.nextLine();

        if (choice.equals(Celsius)) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter the temperature in Fahrenheit: ");
            double fahrenheitTemperature = scanner1.nextDouble();
            System.out.println("The temperature in Celsius is: " + ((fahrenheitTemperature - 32) * (5/9)));

        }

        else if (choice.equals(Fahrenheit)){

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter the temperature in Celsius: ");
            double celsiusTemperature = scanner2.nextDouble();
            System.out.println("The temperature in Fahrenheit is: " + ((celsiusTemperature* 9/5) + 32));
        }

    }

}
