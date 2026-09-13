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
public class Practice2 {
    public static void main(String[]args){
       day(); 
    }
    public static void day(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day");
        String dayName=sc.next();
        switch(dayName){
            case"Monday":
            case"Tuesday":
            case"Wednesday":
            case"Thursday": 
            case"Friday":
            case"Saturday":
             System.out.println("its a weekday");
             break;
             case"sunday":
                 System.out.println("its weekend");
             default:
                 System.out.println("enter invalid day");
        }
    }
}
