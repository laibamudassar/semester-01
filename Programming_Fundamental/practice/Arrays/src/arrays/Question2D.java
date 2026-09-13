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
public class Question2D {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
       System.out.println("enter number  of rows");
      int rows=sc.nextInt();
       System.out.println("enter number  of columns");
      int cols=sc.nextInt();
      int arr[][]=new int[rows][cols];
       System.out.println("enter number  of matrix");
      for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
              
          arr[i][j]=sc.nextInt();    
          }
      }
      for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
               System.out.println("matrix output");
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }
      
  }  
}
