package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumbersOfTheCharacters {

    char stringCharacters;


    public static void main( String[] args ) {

        System.out.println("What is the input string? ");
                Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println(userInput + " has " + userInput.length() + " characters");

    }




}
