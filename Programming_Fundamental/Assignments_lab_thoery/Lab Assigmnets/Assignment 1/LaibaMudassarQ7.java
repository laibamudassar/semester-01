/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LaibaMudassarQ7 {
 public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a numbr of students");
     int studentNumber=sc.nextInt();
     String topName="";
     int maxScore=0;
     for(int i=0;i<studentNumber;i++){
         System.out.println("enter name ");
         String name=sc.next();
          System.out.println("enter score ");
         int score=sc.nextInt();
         if(score > maxScore)
         {
           maxScore=score;
           topName=name;
         }
     }
      System.out.println("top student"+topName);
     
     }
    }   
