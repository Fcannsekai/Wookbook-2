package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();

        System.out.println("Please enter your full name: ");
        String billingName = scanner.nextLine();

        System.out.print("Billing street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing city: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing state: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing zip code: ");
        String billingZip = scanner.nextLine();

        billingAddress.append(billingStreet + " " + billingCity + " " + billingState + " " + billingZip);

        System.out.print("Please enter your full name: ");
        String shippingName = scanner.nextLine();

        System.out.print("Shipping street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping city: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping state: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping zip code: ");
        String shippingZip = scanner.nextLine();

        shippingAddress.append(shippingStreet + " " + shippingCity + " " + shippingState + " " + shippingZip);

        System.out.println(billingName + "\n");
        System.out.println(billingAddress + "\n");
        System.out.println(shippingName + "\n");
        System.out.println(shippingAddress);




    }
}