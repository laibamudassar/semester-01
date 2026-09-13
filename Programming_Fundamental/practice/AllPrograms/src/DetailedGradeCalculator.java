/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class DetailedGradeCalculator {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER  the marks");
       int marks=sc.nextInt();
       char grade;
       if(marks<0|| marks>100)
       {
           System.out.println("invalid marks please enter marks between 0 and 100");
       
      sc.close();
       return;
       }
       else if(marks<=50) 
       {
           grade='F';
                  }
       else if(marks>50&&marks<=60)
       {
           grade='D';
                  }
       else if(marks>60&&marks<=70)
       {
           grade='C';
       }
           else if(marks>70&&marks<=80)
                   {
                  grade='B'; 
                   }
           else if(marks>80&&marks<=90)
           {
               grade='A';
       }
           else 
           {
               grade ='f';
           }
       System.out.println("marks:"+marks+"   grade :"+grade);
       sc.close();
   } 
}
