/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Question1 {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      System.out.println("Enter 5  integer numbers"); //array elements read from user
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
          
      }
       System.out.println("  array");     //print of array elements
     for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
     }
}
}