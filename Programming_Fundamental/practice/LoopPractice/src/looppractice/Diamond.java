/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Diamond {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");     
            int num=sc.nextInt();
      for(int i=1;i<=num;i++){     
          for(int j=1;j<=num-i;j++){
              System.out.print(" ");
          }
         for(int j=1;j<=i*2-1;j++){  
              System.out.print("*"); }
         System.out.println();
      }
       for(int i=2;i<=num;i++){     
          for(int j=1;j<i;j++){
              System.out.print(" ");
          }
         for(int j=1;j<= 2 * (num - i) + 1;j++){  
              System.out.print("*"); }
         System.out.println();
      }
   } 
   } 
 

