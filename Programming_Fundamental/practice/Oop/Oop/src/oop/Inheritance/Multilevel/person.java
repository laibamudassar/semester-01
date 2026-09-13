/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Multilevel;

/**
 *
 * @author PC
 */
public class person {
    public String name;
    public int age;
    public person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void displayProfile(){
        System.out.println("Dispaly person's profile");
    }
    
}
