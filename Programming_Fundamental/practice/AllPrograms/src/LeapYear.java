/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      System.out.println("enter a year");
      int year=input.nextInt();
      if((year%4==0&&year%100!=0)||(year%400==0))
      {
          System.out.println(" The year is leapyear");
      }
      else
      {
          System.out.println("The year is not leap year");
      }
    }
    
}
