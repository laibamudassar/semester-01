/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Switch {
    public static void main(String[]args){
       Scanner input=new Scanner(System.in);
       System.out.println("enter a day number");
        int daynumber=input.nextInt();
        switch(daynumber){
            case 0:System.out.println("sunday");
            break;
            case 1:System.out.println("Monday");
            break;
             case 2:System.out.println("Tuesday");
            break;
             case 3:System.out.println("Wednesday");
            break;
             case 4:System.out.println("Thursday");
            break;
             case 5:System.out.println("Friday");
            break;
             case 6:System.out.println("Saturday");
            break;
             default : System.out.println("enter invalid day");
        }
        
        
    }
}
