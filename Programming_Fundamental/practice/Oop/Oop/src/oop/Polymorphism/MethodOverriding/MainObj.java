/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Polymorphism.MethodOverriding;

/**
 *
 * @author PC
 */
public class MainObj {
    public static void main(String[]args){
        Eagle e=new Eagle();
       e.fly();
       // -> upcasting
       Bird b=new Eagle();
       b.fly();
    }
}
