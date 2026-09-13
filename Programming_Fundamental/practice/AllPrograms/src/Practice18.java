/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice18 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);  
           System.out.println("enter a day number");
      int dayNumber=sc.nextInt();
    //  if(dayNumber==1)
     // {
      //     System.out.println("Monday");
      // }
       // else if(dayNumber==2)
          //     {
           //      System.out.println("Tuesday");  
             //  }    
             //   else if(dayNumber==3)
             //  {
              //   System.out.println("Wednesday");  
             //  }    
             //   else if(dayNumber==4)
             //  {
            switch (dayNumber)
            {
                case 1:
            System.out.println("monday");
            break;
             case 2:
            System.out.println("tuesday");
            break;
             case 3:
            System.out.println("wednesday");
            break;
             case 4:
            System.out.println("thursday");
            break;
             case 5:
            System.out.println("friday");
            break;
             case 6:
            System.out.println("saturday");
            break;
             case 7:
            System.out.println("sunday");
             default:
            System.out.println("enter invalid statement");
            }
            
  }  
}
