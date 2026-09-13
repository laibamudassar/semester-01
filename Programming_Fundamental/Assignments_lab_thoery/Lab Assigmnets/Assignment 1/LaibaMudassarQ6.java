/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LaibaMudassarQ6 {
  public static void main(String[]args){
      Scanner sc=new Scanner (System.in);
      int positiveCount=0,negativeCount=0,sum=0;
      double totalNumbers=0;
      System.out.println("enter number (0 to stop)");
      while(true) {
            int num = sc.nextInt();
            if(num == 0) {
                break;  // stop input if user enters 0
            }
            if(num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            sum += num;       
            totalNumbers++;   
        }
        double average = (double) sum/ totalNumbers;
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Average of numbers: " + average);
    }
}
  
