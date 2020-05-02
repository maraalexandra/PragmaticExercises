package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class LegalDrivingAge {


    public static int legalAge = 16;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        if (age>=legalAge){
            System.out.println("Your are old enough to legally drive! ");

        }

        else if (age < legalAge){
            System.out.println("You are not old enough to legally drive");
        }
    }


}
