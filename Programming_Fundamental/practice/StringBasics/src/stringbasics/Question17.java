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
public class Question17 {
  
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
      String str=sc.nextLine();
      System.out.println("enter a character ");
      char ch=sc.next().charAt(0);
      int count=0;
  for(int i=0;i<str.length();i++){
      char chara=str.charAt(i);
      if(ch==chara){
          count++;
      }
  }
  System.out.println("all ocurrence of character in string : "+count);
  }  
}


