/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class EvenOddCheck {
  public static void main(String[]args){
      System.out.println("enter number");
      Scanner input=new Scanner(System.in);
      int number=input.nextInt();
      String result=(number%2==0)? "Even":"Odd";
      System.out.println(number+"is"+result);
  }  
}
