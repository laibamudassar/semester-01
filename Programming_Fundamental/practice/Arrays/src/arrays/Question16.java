/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */

public class Question16 {
  public static void main(String[]args){
      int arr[]={11,12,13,14,15,16};
      int reverse[]=new int[6];
      for(int i=reverse.length-1,j=0;j<reverse.length;i--,j++){
          reverse[j]=arr[i];
      }
      System.out.println("reverse array is following");
      for(int i=0;i<reverse.length;i++){
      System.out.print(reverse[i]+"  ");
      }
  }  
}
