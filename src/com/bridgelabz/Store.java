package com.bridgelabz;

import java.util.ArrayList;

public class Store {
    /*
    taking an Arraylist for products
     */
    ArrayList<Product> productList = new ArrayList<>();
    /*
    taking an Arraylist for products in the cart
     */
    ArrayList<Product> cartList= new ArrayList<>();
    /*
    creating add method for adding the products in the arraylist
     */
    public ArrayList<Product> addProduct(Product product) {
        this.productList.add(product);
        return this.productList;
    }
    /*
    creating print method for printing the products present in the store
     */
    public void printProductList(){
        for (Product product : this.productList){

            System.out.println("-----------------------------------------------------");
            System.out.println("Product id = " + product.getId());
            System.out.println("Product name = " + product.getPname());
            System.out.println("Product quantity = " + product.getQty());
            System.out.println("Product Price = " + product.getPrice());
            System.out.println("Total Price = " + product.getTotalPrice());
        }
    }
    /*
    creating add method for adding the products in the cart
     */
    public ArrayList<Product> addToCart(Product product){
        this.cartList.add(product);
        return this.cartList;
    }
    /*
    creating print method for printing the products present in the cart
     */
    public void printCartList(){
        for (Product product : this.cartList){

            System.out.println("-----------------------------------------------------");
            System.out.println("Product id = " + product.getId());
            System.out.println("Product name = " + product.getPname());
            System.out.println("Product quantity = " + product.getQty());
            System.out.println("Product Price = " + product.getPrice());
            System.out.println("Total Price = " + product.getTotalPrice());
        }
    }
}
