/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

/**
 *
 * @author PC
 */
public class LoopPractice6 {
   public static void main(String[]args){
       System.out.println("                  Multiplication table               ");
       System.out.println("  ");
      System.out.println("\n-----------------------------------------------------------");
      
    for(int i=1;i<=9;i++)   
    {
        System.out.println(i+"|");
      
       for(int k=1;k<=9;k++) 
       {
           System.out.printf("%4d",i*k);
       }
       System.out.println();
    }
       
       
   }
   
}
