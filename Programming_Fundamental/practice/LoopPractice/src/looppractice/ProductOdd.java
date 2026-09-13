/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

/**
 *
 * @author PC
 */
public class ProductOdd {
   public static void main(String[]args){
       int product=1;
       for(int i=1;i<=15;i+=2){
          
           product*=i;
       }
       System.out.println("product of odd integers is"+product);
   } 
}
