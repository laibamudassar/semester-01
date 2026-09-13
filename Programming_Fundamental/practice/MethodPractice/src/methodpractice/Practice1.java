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
public class Practice1 {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int val1=sc.nextInt();
    System.out.println("Enter second number");
    int val2=sc.nextInt();
    System.out.println("enter an operator");
    char op=sc.next().charAt(0);
    switch(op){
        case'+':
            int result=sum(val1,val2);
            System.out.println("sum ofnumbers="+result );
            break;
             case'-':
            int result2=subtract(val1,val2);
            System.out.println("sum ofnumbers="+result2 );
            break;
             case'*':
            long result3=multiplication(val1,val2);
            
            System.out.println("multiplication ofnumbers="+result3 );
            break;
             case'/':
            double result4=division(val1,val2);
            System.out.println("division ofnumbers="+result4 );
            break;
             default:
            System.out.println("enter invalid operator");
    }
   }
   public static int sum(int val1,int val2){
      int sum=val1+val2;
      return sum;
   }
   public static int subtract(int val1,int val2){
    int subtract=val1-val2;
      return subtract;   
   }
    public static long multiplication(int val1,int val2){
    int multiply=val1*val2;
      return multiply;   
   }
    public static double division(int val1,int val2){
    int division=val1/val2;
      return division;   
   }
}
