/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class TestSwap {
   public static void main(String[]args){
       int []a ={1,2};
       
       System.out.println("before invoking");
        System.out.println("array is{"+a[0]+","+a[1]+"}");
        swap(a[0],a[1]);
        System.out.println("after invoking SwapFirstTwoIn array");
        System.out.println("array is{"+a[0]+","+a[1]+"}");
       swapFirstTwoInArray(a);
       System.out.println("After invoking ");
      System.out.println("array is{"+a[0]+","+a[1]+"}");
   }
   public static void swap(int n1,int n2){
       int temp=n1;
       n1=n2;
       n2=temp;
       
   }
   public static void swapFirstTwoInArray(int[]array){
       int temp=array[0];
       array[0]=array[1];
       array[1]=temp;
   }
}
        
