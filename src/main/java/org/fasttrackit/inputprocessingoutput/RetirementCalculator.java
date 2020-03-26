package org.fasttrackit.inputprocessingoutput;


import java.util.Calendar;


public class RetirementCalculator {

    public static void main(String[] args) {


         String myAge = "27";
         String retireAge = "50";
         int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("What is your current age? " + myAge + "\n" +
                "At what age would you like to retire? " + retireAge + "\n" +
                "You have " + (Integer.parseInt(retireAge) - Integer.parseInt(myAge)) + " years left until you can retire." +
                "It's " + Calendar.getInstance().get(Calendar.YEAR) + ", so you can retire in " + (Calendar.getInstance().get(Calendar.YEAR) + (Integer.parseInt(retireAge) - Integer.parseInt(myAge))) + ".");


    }
}