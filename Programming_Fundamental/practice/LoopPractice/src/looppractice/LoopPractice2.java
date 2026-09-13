/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LoopPractice2 {
   public static void main(String[]args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enetr a integer  number");
       int num=sc.nextInt();
      int count=0;
      while(num>0)
      {
          num=num/10;
            count++;
                    }
      System.out.println(count);
   }
}
