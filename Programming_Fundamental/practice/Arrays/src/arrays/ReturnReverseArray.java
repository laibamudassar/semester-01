/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class ReturnReverseArray {
 public static void main(String[]args){
     int[] list1={1,2,3,4,5,6};
     printArray(list1);
     int[] list2=reverse(list1);
     printArray(list2);
 }
 public static void printArray(int[] num){
     for(int i=0;i<num.length;i++){
         System.out.print(num[i]+"   ");
     }
     System.out.println("     ");
 }
 public static int[] reverse(int[] list){
     int[] result=new int[list.length];
     for(int i=0,j=result.length-1;i<list.length;i++,j--){
         result[j]=list[i];
        }
     return result;
 }
}
