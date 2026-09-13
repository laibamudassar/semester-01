/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringbasics;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Question4 {
   public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter first string");
       String str_1=sc.nextLine();
       System.out.println("Enter secong string");
       String str_2=sc.nextLine();  
      
       System.out.println(str_1.equals(str_2));
}
}
