/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Hierarical;

/**
 *
 * @author PC
 */
public class MainObj {
     public static void main(String[] args) {

        Laptop laptop = new Laptop("P101", "Dell", 85000, 16, "Core i7");

        laptop.displayProduct();
        laptop.compileSoftware();

        System.out.println();

        Moblie mobile = new Moblie("M201", "Samsung", 65000, 50, 5000);

        mobile.displayProduct();
        mobile.takePhoto();
    }
}
