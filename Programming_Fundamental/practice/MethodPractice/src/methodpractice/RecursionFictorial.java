/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class RecursionFictorial {
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
long result=factorialNumber(num);
System.out.println("factorial of"+num+"is"+result);
}   
public static long factorialNumber(int num){
    if(num==0){
        return 1;
    }
        else{
       return num*factorialNumber(num-1);         
                }
    
}
}
