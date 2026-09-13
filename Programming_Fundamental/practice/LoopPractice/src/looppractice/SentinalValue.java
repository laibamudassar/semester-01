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
public class SentinalValue {
 public static void main(String[]args) {
     Scanner sc=new Scanner(System.in);
   System.out.println("Enter a integer (if it is 0 it stop)" );
   int data=sc.nextInt();
   int sum=0;
   while(data!=0)
   {
       sum+=data;
   
      System.out.println("Enter a integer (if it is 0 it stop)" );
      data=sc.nextInt();
   }
   System.out.println("the sum is ="+ sum);
 }  
}
