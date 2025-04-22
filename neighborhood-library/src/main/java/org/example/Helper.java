package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

    public static void showAvailableBooks(ArrayList<Book> books, Scanner scanner) {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                book.displayShortInfo();
            }
        }

        System.out.print("Enter ID to check out a book or -1 to return: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (id >= 0 && id < books.size() && !books.get(id).isCheckedOut()) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            books.get(id).checkOut(name);
            System.out.println("Book checked out to " + name + "!");
        }
    }

    public static void showCheckedOutBooks(ArrayList<Book> books, Scanner scanner) {
        System.out.println("\nChecked Out Books:");
        for (Book book : books) {
            if (book.isCheckedOut()) {
                book.displayDetailedInfo();
            }
        }

        System.out.print("Enter ID to check IN a book or -1 to return: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (id >= 0 && id < books.size() && books.get(id).isCheckedOut()) {
            books.get(id).checkIn();
            System.out.println("Book checked in.");
        }
    }

    public static void searchByTitle(ArrayList<Book> books, Scanner scanner) {
        System.out.print("\nEnter part of the book title: ");
        String query = scanner.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("\nMatching Books:");

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query)) {
                book.displayDetailedInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found with that title.");
        }
    }
}