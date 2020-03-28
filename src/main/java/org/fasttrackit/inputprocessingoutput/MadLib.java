package org.fasttrackit.inputprocessingoutput;


import java.util.Scanner;

public class MadLib {





        public static void main(String[] args) {

            System.out.println("Enter noun: " );
            Scanner scanner= new Scanner(System.in);
            String userInput = scanner.nextLine();
            System.out.println("Enter a verb: ");
            Scanner scanner2 = new Scanner(System.in);
            String user2 = scanner2.nextLine();
            System.out.println("Enter an adjective: ");
            Scanner scanner3 = new Scanner(System.in);
            String user3 = scanner3.nextLine();
            System.out.println("Enter an adverb: ");
            Scanner scanner4 = new Scanner(System.in);
            String user4 = scanner4.nextLine();
            System.out.println("Do you " + user2 + " your " +  user3 + " " + userInput + " " + user4 + " ?" + " That's hilarious!");




        }




}
