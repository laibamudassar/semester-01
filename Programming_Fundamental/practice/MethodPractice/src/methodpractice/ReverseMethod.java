/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class ReverseMethod {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int number=sc.nextInt();
       int   reverseNumber=reverseNumber( number);
      System.out.println("reverse number is="+reverseNumber);
      if(reverseNumber==number){
          System.out.println("palindrome number=yes");
      }
         else {                
          System.out.println("not a palindrome number");
                  }
                        
      }
         
  public static int reverseNumber(int number){
      int reverseNumber=0;
      while(number>0){
     int lastDigit= number%10; 
     reverseNumber=reverseNumber*10+lastDigit;
     number=number/10;
     
      }
      return reverseNumber;
  }
}
