/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author PC
 */
public class ThrowException {
   public static void main(String[]args){
       int age=8;
       try{
           checkAge(age);
       }
       catch(ArithmeticException e){
           System.out.println("an error occured"+e.getMessage());
       }
   } 
   public static void checkAge(int age){
       if(age<11){
           throw new ArithmeticException("Acess denied you are too young to go to trip");
       }
           else{
               System.out.println("you are go with trip");
                   }
       }
   }

