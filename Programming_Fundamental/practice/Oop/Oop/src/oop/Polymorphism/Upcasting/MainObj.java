/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Polymorphism.Upcasting;

/**
 *
 * @author PC
 */
public class MainObj {
    public static void main(String[]args){
       // Shape t=new Triangle();
       // t.draw();
      //  Shape p=new Pentagone();
       // doDrawing(p);
       // p.draw();
        //Shape s=new Triangle();
        // this is also a shortcut way java automatically convert it
        doDrawing(new Triangle());
       // s.draw();
       //-> we pass refrence so relvant child object call insid emethod
    }
       public static void doDrawing(Shape s){
            s.draw();
        }
        
    }

