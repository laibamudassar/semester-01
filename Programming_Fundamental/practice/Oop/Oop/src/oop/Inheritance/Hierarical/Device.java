/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Hierarical;

/**
 *
 * @author PC
 */
public class Device {
   public  String productId;
   public  String brand;
   public double price;

    // Parent Constructor
    public Device(String productId, String brand, double price) {
        this.productId = productId;
        this.brand = brand;
        this.price = price;
    }

    // Parent Method
    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

