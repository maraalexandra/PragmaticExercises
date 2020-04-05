package org.fasttrackit.calculations;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        int priceFirstItem = scanner.nextInt();
        System.out.println("Enter the quantity of item 1: ");
        int quantityFirstItem = scanner.nextInt();
        System.out.println("Enter the price of item 2: ");
        int priceSecondItem = scanner.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        int quantitySecondItem = scanner.nextInt();
        System.out.println("Enter the price of item 3: ");
        int priceThirdItem = scanner.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        int quantityThirdItem = scanner.nextInt();
        double subTotal = priceFirstItem * quantityFirstItem + priceSecondItem * quantitySecondItem + priceThirdItem * quantityThirdItem;
        System.out.println("Subtotal: " + subTotal);
        double tax = 5.5 * subTotal / 100;
        System.out.println("Tax: " + tax);
        double total = tax + subTotal;
        System.out.println("Total: " + total);
    }
}