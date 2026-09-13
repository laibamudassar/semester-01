/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class PassByValue {
   public static void main(String[]args){
       int a=10;
       int b=20;
        System.out.println("before swap in main"+"  a  "+a+"  b  "+b);
       swap(10,20);
       System.out.println("After swap in main"+"  a"+a+"  b   "+b);
       int num[]={10,20};
      System.out.println("Before swap method  "+" num1 "+num[0]+"num2 "+num[1]);
      swap(num);
      System.out.println("After swap method  "+" num1 "+num[0]+"num2 "+num[1]);
   } 
   public static void swap(int val1,int val2){
       int temp=val1;
       val1=val2;
       val2=temp;
       System.out.println("Inside swap method "+"  a  "+val1+" b  "+val2);
   }
   public static void swap(int arr[]){
     int temp=arr[0];
     arr[0]=arr[1];
     arr[1]=temp;
     System.out.println("Inside swap method  "+" num1  "+arr[0]+"num2  "+arr[1]);
   }
}
