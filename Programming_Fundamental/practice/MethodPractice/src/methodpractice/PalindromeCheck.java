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
public class PalindromeCheck {
   public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number");
        int num=sc.nextInt();
      int result=isPalindrome(num);
      if(result==num){
          System.out.println("Number is palindrome");
        }
      else
          System.out.println("number is not palindrome");
      
      System.out.println("Enter a string");
      String str=sc.next();
      System.out.println(str+"is palindrome:"+isPalindrome(str));
         }
           
   public static int isPalindrome( int num){
            int reverseNumber=0;
      while(num>0){
     int lastDigit= num%10; 
     reverseNumber=reverseNumber*10+lastDigit;
     num=num/10;
        }
 return reverseNumber;
  }
   public static boolean isPalindrome(String str){
      int  left=0;
      int  right=str.length()-1;
      str=str.toLowerCase();
       while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
           return false; 
        }
    left++;
    right--;
  }
  return true;
   }
}

