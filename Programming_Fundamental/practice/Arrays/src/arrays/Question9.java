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
public class Question9 {
   public static void main(String[]args){
     Scanner sc=new Scanner (System.in);
     int arr[]=new int[6];
     System.out.println("Enter 6 integers number");
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
           }
     System.out.print("Array before changing");
     for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
     }
     
         System.out.println("Enter a  number to insert");
         int element=sc.nextInt();
             System.out.println("Enter a position number number");
             int index=sc.nextInt();
             for(int i=arr.length-1;i>index;i--){
                 arr[i]=arr[i-1];
             }
             arr[index]=element;
             
             System.out.println("array after changing");
             for(int i=0;i<arr.length;i++){
        
         System.out.print(arr[i]);
             }
   } 
}
