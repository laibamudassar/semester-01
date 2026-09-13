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
public class LargestNumber {
    public static void main(String[]args){
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 number");
       for(int i=0;i<10;i++){
           arr[i]=sc.nextInt();
           
       }
       int largest=arr[0];
       int secondLargest=arr[0];
       for(int i=0;i<10;i++){
           if(arr[i]>largest){
               largest=arr[i];
               
           }
                      
       }
       for(int i=0;i<10;i++){
           if(arr[i]>secondLargest&&arr[i]<largest){
               secondLargest=arr[i];
           }
           System.out.println("largest="+largest);
           System.out.println("SecondLargest="+secondLargest);
       }
            
}
}
