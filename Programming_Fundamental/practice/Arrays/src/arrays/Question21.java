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
public class Question21 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int arr[]=new int[6];
       System.out.println("enter 6 integers");
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
                   }
      System.out.println("Array before change");
      for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]);
                   }
      System.out.println(" ");
      int temp=arr[5];
     for(int i=arr.length-1;i>0;i--){
    arr[i]=arr[i-1];
}
      arr[0]=temp;
      System.out.println("Array after change");
      for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]);
                   }
}
}
  

