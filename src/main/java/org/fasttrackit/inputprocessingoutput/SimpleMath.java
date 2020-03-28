package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {





    public static void main(String[] args) {



        System.out.println("What is the first number? ");
                Scanner scanner = new Scanner(System.in);
                String number1 = scanner.nextLine();

        System.out.println("What is the second number?");
          Scanner scanner2 = new Scanner(System.in);
          String number2 = scanner2.nextLine();


        System.out.println(number1 + "+" + number2 + "=" +
                (Integer.parseInt(number1) + Integer.parseInt(number2)) + "\n" + number1 + "-" + number2 + "=" +
                (Integer.parseInt(number1) - Integer.parseInt(number2))+ "\n" + number1 + "*" + number2 + "=" +
                (Integer.parseInt(number1) * Integer.parseInt(number2)) + "\n" + number1 + "/" + number2 + "=" +
                (Integer.parseInt(number1) / Integer.parseInt(number2)) + "\n");

    }


}
