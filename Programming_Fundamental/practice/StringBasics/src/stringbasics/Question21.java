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
public class Question21 {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    String result=" ";
    boolean removed=false;
     System.out.println("Enter a character to search");
    char search=sc.next().charAt(0);
    
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
       
        if(ch==search && removed==false){

        removed=true;

    }   
        
        else{
             result=result+ch;
       
    }
     }
        System.out.println("string after remove first occurence of character : "+result);
}  

  
}
