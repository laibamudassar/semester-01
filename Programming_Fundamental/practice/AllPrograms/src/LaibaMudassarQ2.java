/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LaibaMudassarQ2 {
   public static void main(String[]args){
    Scanner sc=new Scanner (System.in);   
      System.out.println("enter age");
      int age=sc.nextInt();
      System.out.println("Enter distance in km ");
      int distance=sc.nextInt();
     int pricePerKm=0;
      switch(age/12){
          case 0:
           pricePerKm=20;
           break;
          case 1:
          case 2:
          case 3:             
          case 4:
              pricePerKm=50;
              break;
          default:
              pricePerKm=10;
      }
      int totalPrice=pricePerKm*distance;
      System.out.println("total ticket price= "+totalPrice);
   } 
}
