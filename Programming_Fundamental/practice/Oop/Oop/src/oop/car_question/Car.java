/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.car_question;

/**
 *
 * @author PC
 */
public class Car {
    public String brand;
    public String color;
    public int model;
    
    // constructor 
     public Car(String brand,int model,String color){
         System.out.println("Paramiterized constructor call");
        this.brand=brand;
        this.color=color;
        this.model=model;
     }
    public Car(Car srcobj){
         System.out.println("Copy constructor call");
        this.brand=srcobj.brand;
        this.color=srcobj.color;
        this.model=srcobj.model;
    }

public void carStart(){
    System.out.println(" Car is starting");
}
public void carStop(){
    System.out.println("Car is stopping");
}
public void displayInfo(){
    System.out.println("car of color : "+color+" have model : "+model+"and brand of :"+brand);
}
}