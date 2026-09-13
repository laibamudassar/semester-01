/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Hierarical;

/**
 *
 * @author PC
 */
public class Moblie extends Device {
   public  int camera;
    public int battery;

   public Moblie(String productId, String brand, double price,int camera, int battery) {
         
        super(productId, brand, price);

        this.camera = camera;
        this.battery = battery;
    }

   public void takePhoto() {
        System.out.println("Capturing photo...");
    }
}

