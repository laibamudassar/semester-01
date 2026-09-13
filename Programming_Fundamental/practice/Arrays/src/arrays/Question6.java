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
public class Question6 {
  public static void main(String[]args){
     Scanner sc=new Scanner (System.in);
     int arr[]=new int[6];
     System.out.println("enter 6 integers numbers");
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     int even=0,odd=0;
     for(int i=0;i<arr.length;i++){
         if(arr[i]%2==0){
           even++;  
         }
         else{
             odd++;
         }
     }
     System.out.println("Even count is "+ even+" Odd count is "+odd);
  }  
}
