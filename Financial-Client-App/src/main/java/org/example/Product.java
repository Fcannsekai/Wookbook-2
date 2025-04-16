package org.example;

public class Product {

    private String name;
    private double price;
    private int id;
    private int quantity;

    public String getName() {
        return name;
    }

    public Product(String name, double price, int id, int quantity) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;


    }
}
