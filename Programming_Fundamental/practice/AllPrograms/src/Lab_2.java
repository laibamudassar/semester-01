/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allprograms;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Lab_2 {
   public static void main(String[]args){
                 char grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter pf marks");
        double marksPf=sc.nextDouble();
          System.out.println("enter ict marks");
       double marksIct=sc.nextDouble();
         System.out.println("enter Eng marks");
       double marksEng=sc.nextDouble();
        double totalMarks=marksPf+marksIct+marksEng;
        double average =totalMarks/3;
        double percentage=(totalMarks/300)*100;
        System.out.println("total marks="+totalMarks+  "    avaerage is="+average+    "    percentage="+percentage);
                if(percentage>=80)
              {
        grade='A'; 
      }
      else if(percentage>=70)
      {
         grade='B';
      }
        else if(percentage>=60)
      {
         grade='C';
      }
        else if(percentage>=50)
      {
         grade='D';
      }
       else 
      {
         grade='F';
      } 
      System.out.println("your grade="+grade);
          } 
}
