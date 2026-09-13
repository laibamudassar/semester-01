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
public class Question24 {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enetr a string");
       String str=sc.nextLine();
       String result="";
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           int count=0;
           for(int j=0;j<str.length();j++){
               if(ch==str.charAt(j)){
                 count++;  
               }
           }
           if(count==1){
               result=result+ch;
           }
       }
       System.out.println("after changing string is : "+result);
   } 
}
