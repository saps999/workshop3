package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {
    /*
    initializing products.
     */
        Store store = new Store();
        Product product1 = new Product(1, "Maggie", 5, 5, 25);
        Product product2 = new Product(2, "Dairy Milk", 5, 40, 200);
        Product product3 = new Product(3, "Lay's", 5, 10, 50);
        Product product4 = new Product(4, "Kit-Kat", 5, 10, 50);
        Product product5 = new Product(5, "KurKure", 5, 10, 50);
        /*
        adding the products into arraylist
         */
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        store.addProduct(product5);

    /*
     printing the products present in the store
     */
        store.printProductList();
    /*
    taking input from customer for selecting the menu option
     */
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean keepGoing = true;
        while (keepGoing) {

            System.out.println("\n-------------------Menu - Managing a List-------------------");
            System.out.println("1 Add Maggie to your cart");
            System.out.println("2  Add Dairy Milk to your cart");
            System.out.println("3 Add Lay's to your cart");
            System.out.println("4 Add Kit-Kat to your cart");
            System.out.println("5 Add KurKure to your cart");
            System.out.println("6 Show cart");
            System.out.println("7 Exit");
            System.out.println("Select a menu option");

            choice = sc.nextInt();

            if (choice < 1 || choice > 7) {
                System.out.println("Enter a value between 1 and 7:");
            } else {

                switch (choice) {

                    case 1:
                        store.addToCart(product1);
                        break;

                    case 2:
                        store.addToCart(product2);
                        break;

                    case 3:
                        store.addToCart(product3);
                        break;

                    case 4:
                        store.addToCart(product4);
                        break;

                    case 5:
                        store.addToCart(product5);
                        break;

                    case 6:
                        store.printCartList();
                        break;

                    case 7:
                        //exit
                        keepGoing = false;
                        System.out.println("Goodbye");
                        break;

                }
            }
        }
    }
}

