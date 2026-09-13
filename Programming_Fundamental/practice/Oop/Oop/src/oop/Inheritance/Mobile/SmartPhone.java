/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Mobile;

/**
 *
 * @author PC
 */
public class SmartPhone extends Phone {
    public double storage;
    public int cameraMp;
    public SmartPhone(String name,int model,double storage,int camerMp){
        super(name,model);
        this.cameraMp=camerMp;
        this.storage=storage;
       
    }
    public void takePhoto(){
        System.out.println("Smartphone can take photo");
    }
}
