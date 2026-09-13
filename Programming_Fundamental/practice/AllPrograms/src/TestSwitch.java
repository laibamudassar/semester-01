/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class TestSwitch {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your grade");
      char grade=sc.next().charAt(0);
      switch(grade)
      {
          case 'A':
              System.out.println("Excellent");
         break;
         case'B':
             case'C':
               System.out.println("Welldone"); 
               break;
              case 'D':
              System.out.println("you passed");
         break; 
          case 'F':
              System.out.println("better try again");
         break;
          default:
               System.out.println("invalid grade");
      }
       
  }  
}
