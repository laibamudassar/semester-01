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
public class fibnocciSeries {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a index for a fibnocci series");
    int index=sc.nextInt();
    System.out.println("the fibonacci number at index"+index+"is"+fib(index));
   
          }
  public static long fib(long index){
      if(index==0)
          return 0;
      else if(index==1)
          return 1;
      else
          return fib(index-1)+fib(index-2);
  
  }  
}
