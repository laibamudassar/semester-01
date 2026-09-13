/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringbasics;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Question16 {
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
      String str=sc.nextLine();
      System.out.println("enter a character ");
      char ch=sc.next().charAt(0);
      
  for(int i=0;i<str.length();i++){
      char chara=str.charAt(i);
      if(ch==chara){
          System.out.println("position of chararcter in all string : "+ i);
      }
  }
  
  }  
}
