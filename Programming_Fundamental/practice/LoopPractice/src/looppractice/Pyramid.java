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
public class Pyramid {
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");     
            int num=sc.nextInt();
      for(int i=1;i<=num;i++){     //Spaces → number - i
          for(int j=1;j<i;j++){
              System.out.print(" ");
          }
         for(int j=1;j<= 2 * (num - i) + 1;j++){  //stars -> i*2-1
              System.out.print(" *"); }
         System.out.println();
      }
   } 
}
