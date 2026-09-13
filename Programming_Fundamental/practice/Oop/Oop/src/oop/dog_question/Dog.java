/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.dog_question;

/**
 *
 * @author PC
 */
public class Dog {
    String name;
    String breed;
       // -> paramiterized costructor
    public Dog(String name,String breed){
        this.breed=breed;
        this.name=name;
    }
    public void info(){
      System.out.println(" dog have breed : "+breed+" and name : "+name);
}
}
