/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Trasport;

/**
 *
 * @author PC
 */
public class MainObj {
    public static void main(String[]args){
        Car a=new Car("corolla","2022",4,5,"Auto");
        a.StartAc();
        a.StratEngine();
        a.StopEngine();
            MotorCycle b=new MotorCycle("honda","2023",2,"u","manual");
             b.Wheelie();
        b.StratEngine();
        b.StopEngine();
    }
}
