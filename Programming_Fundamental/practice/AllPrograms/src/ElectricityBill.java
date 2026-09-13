/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class ElectricityBill {
   public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
        System.out.println("  enter units ");
       double units=sc.nextDouble();
       double billAmount=0;
       if(units<=100)
       {
           billAmount=units*5;
       }
       else if(units<=200)
       {
           billAmount=(100*5)+((units-100)*7);
       } 
        else
       {
           billAmount=(100*5)+(200*7)+((units-200)*10);
       }
       System.out.println("total bill amount"+billAmount);
   } 
}
