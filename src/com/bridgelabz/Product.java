package com.bridgelabz;

public class Product {
    // properties
    private int id;
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }
/*
initializing getter and setters
 */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
/*
building constructor
 */
    public Product(int id, String pname, int qty, double price,double totalPrice) {
        this.id = id;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.totalPrice=totalPrice;
    }
}
