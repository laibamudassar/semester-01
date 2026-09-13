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
public class RombhousPattren {
      public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int number=sc.nextInt();
   for(int i=1;i<=number;i++){
       for(int j=1;j<=i;j++){      //for number-i the stra shape become opposite
           System.out.print(" ");
       }
           for(int l=1;l<=number;l++){
              System.out.print("*");  
           }
                   
       
       System.out.println();  
   }
   }
 
  }  



