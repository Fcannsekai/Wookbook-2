package org.example;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private int ID;
    private String checkedOutTo;
    private boolean isCheckedOut;

    public Book(String title, String author, String ISBN, int ID) { // This is my Constructor
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.ID = ID;
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

    public void displayShortInfo() {
        System.out.println("ID: " + ID + " | Title: " + title + " | ISBN: " + ISBN);
    }

    public void displayDetailedInfo() {
        String status = isCheckedOut ? "Checked Out to: " + checkedOutTo : "Available";
        System.out.println("ID: " + ID + " | Title: " + title + " | Author: " + author + " | ISBN: " + ISBN + " | " + status);
    }


    public void checkOut(String name){ // These are my getter and setters

        setCheckedOut(true);
        setCheckedOutTo(name);

    }

    public void checkIn(){

        setCheckedOut(false);
        setCheckedOutTo("");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
}
