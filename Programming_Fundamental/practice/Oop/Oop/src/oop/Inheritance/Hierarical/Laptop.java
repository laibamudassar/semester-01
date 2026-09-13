/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Hierarical;

/**
 *
 * @author PC
 */
public class Laptop extends Device {
   public  int ram;
   public String processor;

   public Laptop(String productId, String brand, double price,  int ram, String processor) {
        super(productId, brand, price);

        this.ram = ram;
        this.processor = processor;
    }

   public void compileSoftware() {
        System.out.println("Software compilation started.");
    }
    
}
