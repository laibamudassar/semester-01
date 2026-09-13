/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class GradeSystem {
  public static void main(String[]args){ 
    System.out.println("enter your marks");
      Scanner sc=new Scanner(System.in);
      double marks=sc.nextFloat();
      if(marks>=90)
      {
          System.out.println("you get A+ ");
      }
      else
      {
          System.out.println("keep studying");
      }
      
      
      
      
}
}
