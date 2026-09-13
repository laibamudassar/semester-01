/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class CheckingNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1=sc.nextInt();
         System.out.println("enter number 2");
        int num2=sc.nextInt();
         System.out.println("enter number 3");
        int num3=sc.nextInt();
        if(num1==num2&&num2==num3&&num3==num1)
        {
            System.out.println(" number are equal ");
        }
        else if(num1!=num2&&num2!=num3&&num3!=num1)
        {
            System.out.println(" number are not equal ");
        }
        else
        {
            System.out.println(" niether equal not different ");
        }
    }
}
