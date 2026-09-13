/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice17 {
  public static void main(String[]args){
      Scanner input=new Scanner(System.in);
        System.out.println("Enter marks");
      int marks=input.nextInt();
     char grade='A';
    
           if(marks>=50)
      {
          if(marks>=90)
          { grade='A';}
           else if(marks>=80)
           { grade='B';}
           else if(marks>=70)
           { grade='C';}
         else 
         {grade='D';}
      }
         else
           {grade='F';   
            System.out.println("Try  again and do hard work");
  }
         System.out.println("marks= "+marks+"grade = "+grade);
         
           
  }  
}
