/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Abstraction.Smart_Device;

/**
 *
 * @author PC
 */
interface SmartDevice{
    public void turnOff();
    public void turnOn();
    public void showStatus();
}
class SmartLight implements SmartDevice{
    public void turnOff(){
        System.out.println("light turnOff");
    } 
    public void turnOn(){
        System.out.println("light turnon");
    } 
    public void showStatus(){
        System.out.println("light work properly");
    } 
}
class SmartFan implements SmartDevice{
    public void turnOff(){
        System.out.println("Fan turnOff");
    } 
    public void turnOn(){
        System.out.println("Fan turnon");
    } 
    public void showStatus(){
        System.out.println("Fan work properly");
    } 
}
class SmartTv implements SmartDevice{
    public void turnOff(){
        System.out.println("tv turnOff");
    } 
    public void turnOn(){
        System.out.println("tv turnon");
    } 
    public void showStatus(){
        System.out.println("tv work properly");
    } 
}
class SmartDoorLock implements SmartDevice{
    public void turnOff(){
        System.out.println("smartlock turnOff");
    } 
    public void turnOn(){
        System.out.println("smartlock turnon");
    } 
    public void showStatus(){
        System.out.println("smartlock work properly");
    } 
}

public class Main {
    public static void main(String[]args){
        
        SmartDevice[] s= {new SmartLight(),new SmartFan(),new SmartTv(),new SmartDoorLock()};
        for(SmartDevice d:s){
           d.turnOn();
           d.showStatus();
           d.turnOff();
        }
    
    }
}
