/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Mobile;

/**
 *
 * @author PC
 */
public class MainObj {
 public static void main(String[]args){
    SmartPhone a=new SmartPhone("samsung",2026,46.6,23);
    a.takePhoto();
    a.powerOff();
    a.powerOn();
    System.out.println(a.name);
}    
}
