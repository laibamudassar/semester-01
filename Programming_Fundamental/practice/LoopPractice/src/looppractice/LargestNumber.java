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
public class LargestNumber {
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in) ;
      System.out.println("enter a number");
       int number=sc.nextInt();
       int largest=0;
       while(number>0)
       {
         int  digit=number%10;
           if(digit>largest)
           {
               largest=digit;
                      
           }
            number=number/10;
           System.out.println("Largest digit in number is"+largest );
       }
   } 
}
