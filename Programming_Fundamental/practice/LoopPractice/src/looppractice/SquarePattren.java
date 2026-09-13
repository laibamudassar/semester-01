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
public class SquarePattren {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int number=sc.nextInt();
   for(int i=0;i<=number;i++){
       for(int j=0;j<=number;j++){
           System.out.print("*");
       }
       System.out.println();  
   }
 
  }  
}
