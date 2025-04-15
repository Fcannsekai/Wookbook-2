package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        if (firstName.toUpperCase().startsWith("DR")) {
            System.out.println("Oh cool, you're a doctor.");
        }

        // ✅ Correct method call
        String fullName = FullName.formatFullName(firstName, middleName, lastName, suffix);

        System.out.println("Full name: " + fullName);

        scanner.close();
    }
}