/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class TestBooleanOperators {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
         System.out.println("Enter number");
                 int num=sc.nextInt();
        if(num%2==0&&num%3==0)
        {
            System.out.println("number is divisible by both ");
        }
        else if(num%3==0)
         {
           System.out.println("number is divisible by 3 ");  
         }
        else if(num%2==0)
        {
            System.out.println("number is divisible by 2 ");  
        }
        else if(num%2!=0||num%3!=0)
        {
            System.out.println("number is not divisible by 2 or3");  
        }
    }
}
