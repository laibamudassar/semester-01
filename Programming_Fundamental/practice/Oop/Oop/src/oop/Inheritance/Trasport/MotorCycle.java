/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Trasport;

/**
 *
 * @author PC
 */
public class MotorCycle extends Vehicle{
    public String handleBarStyle;
    public String SuspensionType;
    public MotorCycle(String name,String model,int noOfTyres,String handleBarStyle,String SuspensionType){
        super(name,model,noOfTyres);
        this.SuspensionType=SuspensionType;
        this.handleBarStyle=handleBarStyle;
    }
    public void Wheelie(){
        System.out.println(" Motorcycle is  doing wheeling!");
    }
}
