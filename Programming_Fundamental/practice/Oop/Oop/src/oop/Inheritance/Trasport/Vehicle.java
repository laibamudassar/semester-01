/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Trasport;

/**
 *
 * @author PC
 */
public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;
    
    public Vehicle(String name,String model,int noOfTyres){
        this.model=model;
        this.name=name;
        this.noOfTyres=noOfTyres;
    }
    public void StratEngine(){
        System.out.println("engine is starting  of "+name+model);
    }
     public void StopEngine(){
        System.out.println("engine is stoping of "+name+model);
    }
}
