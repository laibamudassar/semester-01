/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class TollBoth {
   public static void main(String[]args) {
       Scanner sc=new Scanner (System.in);
       System.out.println("enter a type of vehicle");
       String vehicleType=sc.next();
       switch(vehicleType){
           case"car":
               System.out.println("tolltax=40 rupees");
               break;
               case"Bus":
                   System.out.println("Toltax=80 rupees");
                   break;
                   case"Truck":
                       System.out.println("toll tax =100 rupees");
                       dafault:
       System.out.println("invalid type vehicle");
       
       }
   }
}
