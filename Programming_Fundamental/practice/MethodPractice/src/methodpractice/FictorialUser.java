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
public class FictorialUser {
  public static void main(String[]args){
     fictorial(); 
  } 
  public static void fictorial(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number ");
      int num=sc.nextInt();
      int result=1;
      for(int i=1;i<=num;i++){
        result*=i;  
      }
      System.out.println("fictorial of num is"+result);
          }
}
