/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Question18 {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[6];
       System.out.println("enter 6 integers");
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
                   }
      boolean found=false;
      System.out.println("enter a number for search");
      int num=sc.nextInt();
      for(int i=0;i<arr.length;i++){
          if(num==arr[i]){
              System.out.println("number found"+arr[i]);
               found=true;
           break;   
          }
         
      }
      if(found){
         System.out.println("number found"); 
      }
      else{
          System.out.println("Number not found");
      }
  }  
}
