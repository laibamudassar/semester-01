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
public class FictorialReturn {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
            int num=sc.nextInt();
     int result= fictorial(num);
     System.out.println("fictorial of number ="+result);
  } 
  public static int fictorial(int num){
    
      int result=1;
    
    for(int i=1;i<=num;i++)
    {
       
        result*=i;
        
    }
    
    return result;
  }
}
