/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Teacher;

/**
 *
 * @author PC
 */
public class MainObj {
    public static void main(String[]args){
        MathTeacher b=new MathTeacher( "Ali","mathematics",8,"MSc mathematics");
        System.out.println(b.name);
        System.out.println(b.qualification);
            System.out.println(b.experience+"  years");
            b.markAttendence();
            b.teach();
   
    }
}
