package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class HelloWorld {



    public static void main( String[] args ) {

        System.out.println("What is your name? ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println("Hello " +  userInput + " nice to meet you");
    }


}
