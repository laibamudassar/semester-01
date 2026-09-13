/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LaibaMudassarQ5 {
    public static void main(String[]args){
      Scanner sc=new Scanner (System.in);  
        System.out.println("Enter three digit number");
        int num=sc.nextInt();
        int a=num/100;
        int c=num%10;
        if(a==c)
        {  System.out.println("palidrome");
                }
        else
        {
             System.out.println(" not a palidrome");
        }
    }
}
