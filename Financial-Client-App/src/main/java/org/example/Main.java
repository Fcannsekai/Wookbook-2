package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client[] clients = {
                new Client("Kevin", "Killa", "Murder4hire", "KevinKilla@gmail.com", "510-333-4444"),
                new Client("Marq", "Java", "ibuildanditeach.inc", "marqmeep@gmail.com", "510-888-3222"),
                new Client("Abe", "Ghani", "imakevideogamesinc", "abeabeabe@gmail.com", "510-999-6767"),
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Client Viewer!");
        System.out.println("Please choose an option:");
        System.out.println("1. Show all business names");
        System.out.println("2. Show all email addresses");
        System.out.println("3. Show all clients");
        System.out.println("Enter your choice (1-3): ");

        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("Showing all business names ");
                for (Client client : clients) {
                    System.out.println(client.businessName);
                }
                break;

            case 2:
                System.out.println("Showing all email addresses ");
                for (Client client : clients) {
                    System.out.println(client.getEmailAddress());
                }
                break;

            case 3:
                System.out.println("Showing all clients ");
                for (Client client : clients) {
                    System.out.println(client); // uses toString()
                }
                break;

            default:
                System.out.println("This is not an option please pick from 1, 2, or 3.");
        }

        scanner.close();
    }
}