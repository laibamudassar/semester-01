/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice_11 {
   public static void main(String[]args){
       System.out.println("enter mintues");
       Scanner input=new Scanner (System.in);
      long mintues=input.nextLong();
      long years=mintues/525600;
      long remainingMin=mintues%525600;
      long days=remainingMin/1440;
      System.out.println("DAYS=" + days+  "    YAERS="+years);
      //
      long sec=300;
      long min=sec/60;
      System.out.println("mintues="+min);
   } 
}
