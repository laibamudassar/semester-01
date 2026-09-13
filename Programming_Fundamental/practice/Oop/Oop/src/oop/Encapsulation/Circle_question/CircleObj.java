/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Circle_question;

/**
 *
 * @author PC
 */
public class CircleObj {
   public static void main(String[]args){
       Circle a=new Circle(23.4);
       System.out.println(" radius :"+a.getRadius());
      // System.out.println();
       System.out.println("After modification");
       double radius=7.5;
       a.setRadius(radius);
       System.out.println("radius : "+a.getRadius());
      System.out.println(" area : "+a.Area(radius)); 
        System.out.println(" perimeter : "+a.perimeter(radius)); 
   } 
}
