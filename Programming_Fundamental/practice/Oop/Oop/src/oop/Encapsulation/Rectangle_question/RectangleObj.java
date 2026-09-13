/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Rectangle_question;

/**
 *
 * @author PC
 */
public class RectangleObj {
    public static void main(String[]args){
    Rectangle a=new Rectangle(234.4,566.7);
    System.out.println("Length and width before modification");
   System.out.println("length :"+a.getLength());
   System.out.println("width :"+a.getWidth());
   double length=34.5;
   System.out.println("Length and width after modification");
   a.setLength(length);
   System.out.println(" length : "+a.getLength());
    double width=65.8;
    a.setwidth(width);
     System.out.println(" width : "+a.getWidth());
}
}