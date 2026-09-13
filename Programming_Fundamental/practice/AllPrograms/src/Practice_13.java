/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice_13 {
 public static void main(String[]args)
 {System.out.println("enter values");
           Scanner input=new Scanner(System.in);
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      int d=input.nextInt();
      int sum=a+b+c+d;
              System.out.println("sum of digits="+sum);
       System.out.println("enter four digits");
         int num=input.nextInt();
         int d1=num/1000;
         int d2=(num/100)%10;
         int d3=(num/10)%10;
         int d4=num%10;
         System.out.println(d1);
         System.out.println(d2);
         System.out.println(d3);
         System.out.println(d4);
         
 }   
 
}
