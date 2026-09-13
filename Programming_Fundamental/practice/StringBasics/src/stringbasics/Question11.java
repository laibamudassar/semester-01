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
public class Question11 {
     public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    String reverse="";
    for(int i=str.length()-1;i>=0;i--){
      char ch=str.charAt(i);
      reverse=reverse+ch;
          }
    System.out.println("reveres of string follow : "+reverse);
     }
}
