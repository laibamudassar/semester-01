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
public class Question7 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    String result="";
    
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
         if(ch >= 'A' && ch <= 'Z'){
         ch = Character.toLowerCase(ch);      
         }
         else{
             ch=Character.toUpperCase(ch);
         }
         result=result+ch;
        }
    
    System.out.println(result);
    }
        
  }  

