package org.fasttrackit.ForLoopExercises;

public class LogicalOp {

    public static void incrementNumber(int number) {

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void decrementNumber(int number) {
        for (int i = number; i >= -100; i--) {

            System.out.println(i);
        }

    }

    public static void incrementTwoNumbers(int number1, int number2) {

        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }
    }

    public static void decrementTwoNumbers(int number1, int number2) {
        if (number1 > number2) {
            for (int i = number2; i <= number1; i++) {
                System.out.println(i);
            }
        } else if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                System.out.println(i);
            }
        }
    }

    public static void parityNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void imparityNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static int sumOfNumbers(int number1) {
        int sum = 0;
        for (int i = number1; i <= 100; i++) {
           sum =sum + i;
        }
        return sum;
    }
    public static int averageCalculator(int number1){
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = number1; i<=100; i++){
            sum = sum + i;
            count++;
        }
        average = sum / count;
        return average;
    }

    public static void asteriskCount(){
        int rows = 7;
        String asterisk ="*";

        for (int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++)
            {
                System.out.print(asterisk);
            }
           System.out.println();
        }
    }
}