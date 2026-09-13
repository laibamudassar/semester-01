/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice8 {
  public static void main(String[]args){
  System.out.println("enter your age");
  Scanner sc=new Scanner(System.in);
  int age=sc.nextInt();
  if(age>=18)
  {   
   System.out.println("eligible for voting");
  } 
  else
  {
      System.out.println("not eligible for voting");
  }
}
}
