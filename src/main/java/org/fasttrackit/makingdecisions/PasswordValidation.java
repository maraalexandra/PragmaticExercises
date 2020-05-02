package org.fasttrackit.makingdecisions;

import java.util.Scanner;

public class PasswordValidation {

    public static String correctPassword = "abc$123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the password? ");
        String password = scanner.nextLine();
        if (password.equals(correctPassword)){
            System.out.println("Welcome! ");
        }
        else if (!password.equals(correctPassword)){
            System.out.println("I don't know you! ");
        }
    }
}
