/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.car_question;

/**
 *
 * @author PC
 */
public class CarObj {
 public static void main(String[]args){
     Car a=new Car("BMW",2026,"Black");
    a. carStart();
     a.carStop();
    a. displayInfo();
    Car b=new Car(a);
    b. carStart();
     b.carStop();
    b. displayInfo();
 }   
}
