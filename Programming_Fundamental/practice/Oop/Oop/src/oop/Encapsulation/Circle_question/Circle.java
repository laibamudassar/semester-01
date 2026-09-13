/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Circle_question;

/**
 *
 * @author PC
 */
public class Circle {
   private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius=r;
    }
    public double Area(double r){
        return Math.PI*r*r;
    }
    public Double perimeter(double r){
        return Math.PI*r*2;
    }
}
