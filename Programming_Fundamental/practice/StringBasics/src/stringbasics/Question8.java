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
public class Question8 {
 public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Entr a string");
     String str=sc.nextLine();
     int alphabet=0;
     int digit=0;
     int special=0;
     for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         if(Character.isAlphabetic(ch)){
             alphabet++;
         }
         else if(Character.isDigit(ch)){
             digit++;
         }
         else{
             special++;
         }
     }
     System.out.println("alphabet in string "+alphabet+" digit in string "+digit+" specialdigits in string "+special);
 }   
}
