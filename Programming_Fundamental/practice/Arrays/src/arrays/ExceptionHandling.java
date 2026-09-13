/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class ExceptionHandling {
   public static void main(String[]args){
       int values[]={22,34,45,56,78};
       
       try{
           System.out.println("value at index 5 is "+values[5]);
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("oops threre index does not exists"+e.getMessage());
       }
       System.out.println("main code will not terminnat");
   } 
}
