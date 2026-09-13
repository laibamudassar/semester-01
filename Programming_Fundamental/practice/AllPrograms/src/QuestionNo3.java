/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class QuestionNo3 {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);   
        System.out.println("enter a day name");
        String dayName=sc.next();
        switch(dayName)
        {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
             case "friday":
                 case "saturday":  
                System.out.println("it is a week day");
                break;
                         case "sunday": 
          System.out.println("it is a weekend");
                         default:
   {
       System.out.println("enter invalid day");
   }    
        }
        
    }
}
