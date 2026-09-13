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
public class Question8 {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      System.out.println("Enter 5  integer numbers");
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
          
      }
       System.out.println(" first array");
     for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
     }
      int arr_2[]=new int[5];
      for(int i=0;i<arr_2.length;i++){
          arr_2[i]=arr[i];
      }
      System.out.println("array 2 copy from first array");
     for(int i=0;i<arr.length;i++){
       System.out.println(arr_2[i]);
     
     }
  }  
}
