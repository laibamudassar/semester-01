/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.person_question;

/**
 *
 * @author PC
 */
public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void Info(){
        System.out.println("name :"+name);
         System.out.println("age :"+age);
    }
}
