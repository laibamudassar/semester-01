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
public class UserCalculation {
  
   public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
          System.out.println("Enter number 2");
        int num2=sc.nextInt();
       System.out.println("Enter an operator");
       char op=sc.next().charAt(0);
       switch(op){
       case'+':
           sum(num1,num2);
           break;
           case'-':
               subtraction();
              break; 
           case'*':
               multiplication();
               break;
               case'/':
                   division();
                   break;
               default:
                   System.out.println(" you Enter invalid operator"); 
   }
   } 
    public static void sum(int val1,int val2){
       //int num1=4;
      // int num2=2;
      int  result=val1+val2;
      System.out.printf("sum is=%d\n",result);
        }
   public static void subtraction(){
       int num1=2;
       int num2=1;
      int  result=num1-num2;
      System.out.printf("subtraction  is=%d\n",result);
        }
public static void multiplication(){
       int num1=5;
       int num2=4;
      int  result=num1*num2;
      System.out.printf("mutliplication is=%d\n",result);
        }
public static void division(){
 int num1=6;
 int num2=3;
 int result=num1/num2;
 System.out.printf("tne division is=%d\n",result);
} 
}
  

