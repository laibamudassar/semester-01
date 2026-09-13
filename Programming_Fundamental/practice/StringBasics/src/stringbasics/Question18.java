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
public class Question18 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a string");
    String str=sc.nextLine();
    char highest=' ';
    int max=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
         int count=0;
           
         for(int j=0;j<str.length();j++){
        if(ch==str.charAt(j)){
            count++;
        }
    }
   
        if(count>max){
           max= count;
            highest=ch;
          
    }
    }
     System.out.println("the chracter apper maximum time : "+highest);
        System.out.println("ch appear maximum time in string: "+max);
  }  
}
