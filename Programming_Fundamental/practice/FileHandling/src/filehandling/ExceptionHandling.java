/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author PC
 */

public class ExceptionHandling {
   public static void main(String[]args){
       int marks[]={23,3,4,45,56,65};
       int a=10,b=0;
       try{
          // System.out.println(marks[9]);
           System.out.println(a/b);
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("an error occured"+e.getMessage());
       }
       catch(ArithmeticException e){
           System.out.println("an error occured"+e.getMessage());
       }
   } 
}
