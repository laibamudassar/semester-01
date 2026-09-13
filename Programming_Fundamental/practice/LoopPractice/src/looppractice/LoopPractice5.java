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
public class LoopPractice5 {
   public static void main(String[]args){
    Scanner sc=new Scanner (System.in);;
    System.out.println("enter a number");
    int num=sc.nextInt();
     int reverse=0;  
      while(num>0)
      {
          int lastDigit=num%10;
          reverse=reverse*10+lastDigit;
          num=num/10;
      }
      System.out.println(reverse);
   } 
}
