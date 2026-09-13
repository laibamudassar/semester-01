/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class WeekMethod {
  public static void main(String[]args){
      
      
      day();
  }  
  public static void day(){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name of day");
      String dayname=sc.next();
      switch(dayname){
    case"monday":
    case"tuesday":
    case"wednesday":
    case"thursday":
        case"friday":
    case"Saturday":
System.out.println("it is a weekday");
break;
    case"sunday":
        System.out.println("it is weekend");
        break;
    default:
        System.out.println("you enter invalid input");
       }
  }
}
