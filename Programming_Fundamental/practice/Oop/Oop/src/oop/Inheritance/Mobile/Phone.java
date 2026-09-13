/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Mobile;

/**
 *
 * @author PC
 */
public class Phone {
    public String name;
    public int model;
    public Phone(String name,int model){
        this.model=model;
        this.name=name;
    }
    public void powerOn(){
        System.out.println(name+" is power on");
        
    }
     public void powerOff(){
        System.out.println(name+" is power off");
        
    }
}
