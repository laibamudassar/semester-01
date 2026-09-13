/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Rectangle_question;

/**
 *
 * @author PC
 */
public class Rectangle {
   double width;
   double height;
   public Rectangle( double width,double height){
       this.width=width;
       this.height=height;
   }
   public void area(){
       
   System.out.println("Area of ractangle : "+height*width);
}
   public void perimeter(){
       double perimeter=(height+width)*2;
       System.out.println("perimetr of rectangle : "+perimeter);
   }
}
