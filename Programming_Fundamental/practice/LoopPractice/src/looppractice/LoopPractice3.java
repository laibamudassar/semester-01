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
public class LoopPractice3 {
   public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
       System.out.println("enetr a number ");
       int num=sc.nextInt();
       int lastDigit=num%10;
       while(num>=10){
           num=num/10;
          
       }
       int firstDigit=num;
       System.out.println("first digit"+firstDigit+"  last digit"+lastDigit);
   } 
}
