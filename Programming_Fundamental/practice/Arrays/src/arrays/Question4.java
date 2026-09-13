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
public class Question4 {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int arr[]= new int[5];
      System.out.println("enter 5 integrs");
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
      }
      int minimum=arr[0];
      for(int i=0;i<arr.length;i++){
          if(arr[i]<minimum){
              minimum=arr[i];
          }
      }
      System.out.println("minimum value in array "+minimum);
  }  
}
