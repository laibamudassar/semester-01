/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class PattrenLoop {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int number=sc.nextInt();
       for(int i=1;i<=number;i++)
       {
           for(int j=i;j<=number;j++)   // for simple for  -> (int j=1;j<=i;j++)
           {
               System.out.print("*");
           }            
           
           System.out.println();
       }
   } 
}
