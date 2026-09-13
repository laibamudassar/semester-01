/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grade;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class java {
    public static void main(String[]args){
     int marks;
     char grade;
     Scanner sc=new Scanner (System.in);
     System.out.println("enter your marks");
      marks=sc.nextInt();
      if(marks>=80)
      {
          grade='A';
      }  
        else if(marks>=70)
      {
          grade='B';
      }  
        else if(marks>=60)
      {
          grade='C';
      }    
        else if(marks>=50)
      {
          grade='D';
      }  
       else 
      {
          grade='F';
      }  
     System.out.printf("your grade=%C      ",grade);                 
        
        
    }
    
}
