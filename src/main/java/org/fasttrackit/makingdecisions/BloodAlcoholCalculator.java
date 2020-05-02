package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class BloodAlcoholCalculator {

    public static double menRatio = 0.73;
    public static double womenRatio = 0.66;
    public static double BAC = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total alcohol consumed is: ");
        double alcohol = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Your body weight in pounds : ");
        double weight = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("The number of hours since the last drink is: ");
        double hours = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("What is your gender? ");
        String gender = scanner3.nextLine();

        if (gender.equals("M")){
            BAC = ((alcohol * 5.14/ weight* menRatio) - (0.015*hours));
        }
        else if (gender.equals("F")){

            BAC = ((alcohol * 5.14/ weight* womenRatio) - (0.015*hours));
        }
        System.out.println("Your BAC is: " + BAC);

        if (BAC>= 0.08){
            System.out.println("It is not legal for you to drive!!!");
        }
        else if(BAC<=0.08){
            System.out.println("It is legal for you to drive!");
        }

    }
}
