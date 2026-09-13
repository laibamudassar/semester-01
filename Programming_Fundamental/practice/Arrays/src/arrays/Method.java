/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class Method {
   public static void main(String[]args){
       int[] a={3,4,5,6};
       printArray(a);
   } 
   public static void printArray(int[]a){
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
   }
}
