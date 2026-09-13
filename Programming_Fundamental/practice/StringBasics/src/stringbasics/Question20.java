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
public class Question20 {
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a string");
    String str=sc.nextLine();
  
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
         int count=0;
           
         for(int j=0;j<str.length();j++){
        if(ch==str.charAt(j)){
            count++;
            
        }
    }
         System.out.println("the  : "+ch+" appear : "+count+"  times ");
       
    }
 }
}
