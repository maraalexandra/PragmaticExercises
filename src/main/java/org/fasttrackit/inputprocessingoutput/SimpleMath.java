package org.fasttrackit.inputprocessingoutput;

public class SimpleMath {


    public static String number1 = "10";
    public static String number2 = "5";


    public static void main(String[] args) {

        System.out.println("What is the first number? " + number1 + "\n" + "What is the second number? " + number2 + "\n" + (number1 + "+" + number2 + "=" +
                (Integer.parseInt(number1) + Integer.parseInt(number2)) + "\n" + number1 + "-" + number2 + "=" +
                (Integer.parseInt(number1) - Integer.parseInt(number2))+ "\n" + number1 + "*" + number2 + "=" +
                (Integer.parseInt(number1) * Integer.parseInt(number2)) + "\n" + number1 + "/" + number2 + "=" +
                (Integer.parseInt(number1) / Integer.parseInt(number2)) + "\n"));

    }


}
