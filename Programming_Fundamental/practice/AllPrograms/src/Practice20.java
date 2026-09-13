/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice20 {
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in); 
       System.out.println("enter three number");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
      if(a+b>c)
      {
          if(b+c>a&&c+a>b)
       {
           System.out.println("a valid triangle");
       }
       else
       {
           System.out.println("not a valid triangle");
       }
      }
       else
      {
          System.out.println("not a valid triangle");
      }
   } 
}
