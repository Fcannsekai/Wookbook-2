package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name here: ");
        String fullName = scanner.nextLine();

        System.out.println("What is your desired date? Format: MM/dd/yyyy: ");
        String date = scanner.nextLine();

        System.out.println("How many tickets purchased?: ");
        int ticket = scanner.nextInt();

        int indexFullName = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexFullName);
        String lastName =fullName.substring(indexFullName +1);
        String formattedName = lastName + " " + firstName;

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate finalDate =LocalDate.parse(date, formatDate);

        String ticketWord = (ticket == 1) ? "ticket" : "tickets";

        System.out.println(ticket + " " + ticketWord + " reserved for " + finalDate + " under " + formattedName);


    }
}