/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LaibaMudassarQ1 {
  public static void main(String[]args) {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int sum=0;
      for(int i=1;i<=num;i++){
         if(i%2==0) continue; 
                  if(i%10==7) continue; 
             sum+=i;
             if (sum >500)break;
      }
      System.out.println("Final sum"+sum);
      }
  } 
