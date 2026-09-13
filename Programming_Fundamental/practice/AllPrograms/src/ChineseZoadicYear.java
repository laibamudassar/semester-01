/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class ChineseZoadicYear {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
System.out.println("enter a year");
int year=sc.nextInt();
switch(year%12) {
    case 0:System.out.println("monkey");
        break;
    case 1:System.out.println("Rooster");
        break;
         case 2:System.out.println("Dog");
        break;
         case 3:System.out.println("Pig");
        break;
         case 4:System.out.println("Rat");
        break;
         case 5:System.out.println("Ox");
        break;
         case 6:System.out.println("Tiger");
        break;
         case 7:System.out.println("Rabit");
        break;
         case 8:System.out.println("Dragon");
        break;
         case 9:System.out.println("Snake");
        break;
         case 10:System.out.println("Horse");
        break;
         case 11:System.out.println("Sheep");
}
 }  
      }
