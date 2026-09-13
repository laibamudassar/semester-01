/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class MonthName {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      String []month={"Janauray","feburary","march","april","may","june","july","august","september","november","october","December"};
      System.out.println("Enter a month number");
      int monthNumber=sc.nextInt();
      if(monthNumber>=1&&monthNumber<=12){
          System.out.println("The month is  "+month[monthNumber-1]);
      }
      else{
          System.out.println("Enter invalid number");
      }  
          }  
}
