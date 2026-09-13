/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class MonthCalculation {
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int days=0;
       System.out.println("enter years");
             int years=sc.nextInt();
              System.out.println("enter month");
      int month=sc.nextInt();
      if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) 
      {
          System.out.println("31 Days");
      }
      else if(month==4||month==6||month==9||month==11) 
              {
                  System.out.println("30 Days"); 
              }
          else if(month==2)
       {
          if((years%4==0&&years%100!=0)||(years%400==0))
          {
              System.out.println("29 Days leap year"); 
          }  
          else
          {
                  System.out.println("28 Days"); 
                  }
                         }
                      else
      {
           System.out.println("enter invalid month and year");
      }
          } 
}
