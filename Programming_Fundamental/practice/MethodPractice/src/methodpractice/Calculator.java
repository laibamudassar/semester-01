/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
public class Calculator {
   public static void main(String[]args){
     sum();  
     subtraction();
     multiplication();
     division();
   } 
   public static void sum(){
       int num1=4;
       int num2=2;
      int  result=num1+num2;
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
  
