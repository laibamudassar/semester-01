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
public class Question13 {
     public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    String words[]=str.split(" ");
    for(int i=words.length-1;i>=0;i--){
      System.out.print(words[i]+" ");  
    }
     }
}
