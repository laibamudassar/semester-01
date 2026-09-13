/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Polymorphism.MethodOverloading;

/**
 *
 * @author PC
 */
public class Main {
   public static void main(String[]args){
       Calculator c=new Calculator();
       System.out.println(c.multiply(6, 4));
       System.out.println(c.multiply(3.5, 5.6));
        System.out.println(c.multiply(3.4, 5));
   } 
}
