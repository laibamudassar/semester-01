/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Circle_question;

/**
 *
 * @author PC
 */
public class Circle {
    double radius;
    // -> paramiterized constructor call
    public Circle(double radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("Area of circle = "+radius*radius*3.14);
    }
    public void circumference(){
        System.out.println("circumference of circle = "+2*radius*3.14);
    }
}
