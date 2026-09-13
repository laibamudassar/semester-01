/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class SumOfArrays {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int num[]=new int[5];
      System.out.println("Enter 5 numbers ");
      int sum=0;
      for(int i=0;i<num.length;i++){
          num[i]=sc.nextInt();
          sum+=num[i];
      }
      double average=sum/num.length;
         System.out.println("sum of didits of Array =  "+sum);
         System.out.println("average is= "+average);
         int count=0;
         for(int i=0;i<num.length;i++){
             if(num[i]>average){
                 count++;
             }
                      }
         System.out.println("number above average="+count);
  }  
}
