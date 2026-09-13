/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Trasport;

/**
 *
 * @author PC
 */
public class Car extends Vehicle{
    public int noOfDoors;
    public String transmissionType;
    public Car(String name,String model,int noOfTyres,int noOfDoors,String transmissionType){
        super(name,model,noOfTyres);
        this.transmissionType=transmissionType;
        this.noOfDoors=noOfDoors;
    }
    public void StartAc(){
        System.out.println(" start ac");
    }
    
}
