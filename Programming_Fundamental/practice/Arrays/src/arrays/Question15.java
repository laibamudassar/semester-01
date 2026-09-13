/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class Question15 {
  public static void main(String[]args){
      int arr_1[]={20,30,40};
      int arr_2[]={50,60,70};
      int arr_3[]=new int[6];
      for(int i=0;i<arr_1.length;i++){
          arr_3[i]=arr_1[i];
      }
      for(int i=0;i<arr_2.length;i++){
          arr_3[i+arr_1.length]=arr_2[i];
      }
      System.out.println("merge array is following");
      for(int i=0;i<arr_3.length;i++){
      System.out.println(arr_3[i]);
      }
  }  
}
