/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Teacher;

/**
 *
 * @author PC
 */
public class Teacher {
    public String name;
    public String subject;
    public int experience;
    public Teacher(String name,String subject,int experience){
        this.name=name;
        this.subject=subject;
        this.experience=experience;
    }
    public void teach(){
        System.out.println(" teacher "+name+" is teaching");
    }
      public void markAttendence(){
        System.out.println(" teacher "+name+" mark Attendence of students ");
    }
}
