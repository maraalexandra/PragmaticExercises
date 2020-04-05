package org.fasttrackit.calculations;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people?");
        int people = scanner.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizzas = scanner.nextInt();
        int pizzaSlicesInOnePizza = 8;
        double maxNumberOfSlices = pizzas * pizzaSlicesInOnePizza / people;
        System.out.println("There are " + people + " people" + "\n" + "each person gets " + maxNumberOfSlices + " slices of pizza");
        int leftOvers = pizzaSlicesInOnePizza * pizzas % people;
        System.out.println("There are " + leftOvers + " leftovers slices");

    }
}