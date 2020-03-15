package org.fasttrackit.inputprocessingoutput;



import java.util.Date;

public class RetirementCalculator {

    public static String myAge = "27";
    public static String retireAge = "50";


    public static void main(String[] args) {

        Date today = new Date ("March 15, 2020, 22:00");



        System.out.println("What is your current age? " + myAge + "\n" +
                "At what age would you like to retire? " + retireAge + "\n" +
                "You have " + (Integer.parseInt(retireAge) - Integer.parseInt(myAge)) + "years left until you can retire." +
                "It's " + today.getYear() + ",so you can retire in " + today.getYear() + (Integer.parseInt(retireAge) - Integer.parseInt(myAge)) + ".");
    }
}
