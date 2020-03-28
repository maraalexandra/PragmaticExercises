package org.fasttrackit.inputprocessingoutput;


import java.util.Calendar;
import java.util.Scanner;


public class RetirementCalculator {

    public static void main(String[] args) {

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("What is your current age? ");

        Scanner scanner = new Scanner(System.in);
        String myAge = scanner.nextLine();

        System.out.println("At what age would you like to retire? ");
        Scanner scanner1 = new Scanner(System.in);
        String retireAge = scanner1.nextLine();


        System.out.println( "You have " + (Integer.parseInt(retireAge) - Integer.parseInt(myAge)) + " years left until you can retire." +
                "It's " + Calendar.getInstance().get(Calendar.YEAR) + ", so you can retire in " + (Calendar.getInstance().get(Calendar.YEAR) + (Integer.parseInt(retireAge) - Integer.parseInt(myAge))) + ".");


    }
}