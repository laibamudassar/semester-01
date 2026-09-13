/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class Question17 {
  public static void main(String[]args){
      int arr[]={22,3,43,45,46,47,6,2};
      int even[]=new int[arr.length];
      int odd[]=new int[arr.length];
       int evenIndex=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
              even[evenIndex]=arr[i];
              evenIndex++;
          }
      }
      
      System.out.println("even array is following");
      for(int i=0;i<evenIndex;i++){
      System.out.print(even[i]+"  ");
      }
     System.out.println();
      int oddIndex=0;
          for(int i=0;i<arr.length;i++){
          if(arr[i]%2!=0){
              odd[oddIndex]=arr[i];
              oddIndex++;
          }
      }
          System.out.println("odd array is following");
      for(int i=0;i<oddIndex;i++){
      System.out.print(odd[i]+"  ");
      }
  }  
}
