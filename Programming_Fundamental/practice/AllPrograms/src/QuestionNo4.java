/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class QuestionNo4 {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter five integer value");
      int sum=0;
      for(int i=1;i<=5;i++)
      {
          int number=sc.nextInt();
          if(number%2!=0)
          {
             sum+=number; 
                       
          }      
          }
          System.out.println("The sum of odd number="+sum);
      }
}
