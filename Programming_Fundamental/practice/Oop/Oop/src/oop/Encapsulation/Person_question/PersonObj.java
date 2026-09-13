/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Person_question;

/**
 *
 * @author PC
 */
public class PersonObj {
    public static void main(String[]args){
        Person a=new Person(23,"alea","turkey");
        System.out.println(a.getname());
         System.out.println(a.getcountry());
          System.out.println(a.getage());
         String name="jeena";
         a.setname(name);
         System.out.println(a.getname());
    }
}
