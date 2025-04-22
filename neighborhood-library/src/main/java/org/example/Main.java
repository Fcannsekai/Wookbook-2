package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //imported scanner and arraylist
        ArrayList<Book> books = new ArrayList<>();

        // This is our current inventory
        books.add(new Book("The Three-Body Problem", "Cixin Liu", "9780765382030", 0));
        books.add(new Book("Atomic Habits", "James Clear", "9780735211292", 1));
        books.add(new Book("Fahrenheit 451", "Ray Bradbury", "9781451673319", 2));
        books.add(new Book("1984", "George Orwell", "9780451524935", 3));
        books.add(new Book("Things Fall Apart", "Chinua Achebe", "9780385474542", 4));
        books.add(new Book("Mushoku Tensei Vol. 1", "Rifujin na Magonote", "9781642751383", 5));
        books.add(new Book("Artemis Fowl", "Eoin Colfer", "9781368036986", 6));
        books.add(new Book("Unbroken", "Laura Hillenbrand", "9780812974492", 7));
        books.add(new Book("Prisoner B-3087", "Alan Gratz", "9780545459013", 8));
        books.add(new Book("The Heroin Diaries", "Nikki Sixx", "9781501187544", 9));
        books.add(new Book("90 Rules for Entrepreneurs", "Marnus Broodryk", "9780620758352", 10));
        books.add(new Book("The 48 Laws of Power", "Robert Greene", "9780140280197", 11));
        books.add(new Book("Ender's Game", "Orson Scott Card", "9780812550702", 12));
        books.add(new Book("The Prince", "Niccolò Machiavelli", "9781668506448", 13));
        books.add(new Book("Disruptive Thinking", "T.D. Jakes", "9781546004004", 14));
        books.add(new Book("Berserk", "Kentaro Miura", "302029230301", 15));
        books.add(new Book("Dragon Ball", "Akira Toriyama", "29302494942", 16));
        books.add(new Book("Fist of the North Star", "Tetsuo Hara", "8208480223", 17));
        books.add(new Book("Hunter x Hunter", "Yoshihiro Togashi", "820384850350", 18));
        books.add(new Book("Inuyasha", "Rumiko Takahashi", "10192848493", 19));

        boolean libraryOpen = true; // set to true, so I can set up my while loop

        while (libraryOpen) {
            System.out.println("\nWelcome to the my Library what can i help you with? ");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Search for a Book by Title");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    Helper.showAvailableBooks(books, scanner);
                    break;
                case "2":
                    Helper.showCheckedOutBooks(books, scanner);
                    break;
                case "3":
                    Helper.searchByTitle(books, scanner);
                    break;
                case "4":
                    System.out.println("Have a good day!");
                    libraryOpen = false;
                    break;
                default:
                    System.out.println("THAT IS NOT ALLOWED");
            }
        }
    } // im using switch case instead of else if, I just think it looks prettier
}
