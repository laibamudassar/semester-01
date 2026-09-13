/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice19 {
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in) ;
     System.out.println("enter three numbers");
     int a=sc.nextInt();
      int b=sc.nextInt();
     int c=sc.nextInt();
     if(a==b&&b==c&&c==a)
     {
         System.out.println("triangle is eqilateral");
     }
     else
     {
         System.out.println("not an equilateral triangle");
     }
   } 
}
