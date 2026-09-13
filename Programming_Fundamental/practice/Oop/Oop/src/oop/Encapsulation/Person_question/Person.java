/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Person_question;

/**
 *
 * @author PC
 */
public class Person {
    private int age;
    private String name;
    private String country;
   public  Person(int age,String name,String country){
       this.age=age;
       this.name=name;
       this.country=country;
       
   }
   public String getname(){
      return this.name;
   }
   public int getage(){
      return this.age;
   }
   public String getcountry(){
      return this.country;
   }
   public void setname(String name){
       this.name=name;
   }
}
