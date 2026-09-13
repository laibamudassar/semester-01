/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LabTask {
  public static void main(String[]args){ 
    System.out.println("enter your marks");
    Scanner sc=new Scanner(System.in);
    int marks;  char grade;
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
      System.out.printf("%c grade ",grade);
                   
        }
}
