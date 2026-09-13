/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Teacher;

/**
 *
 * @author PC
 */
public class MathTeacher extends Teacher {
    public String qualification;
    public MathTeacher(String name,String subject,int experience,String qualification){
        super(name,subject,experience);
        this.qualification=qualification;
    }
    
}
