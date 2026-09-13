/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Question22d {
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter input");
    int [][]matrix1=new int[2][2];
     int [][]matrix2=new int[2][2];
     for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
             matrix1[i][j]=sc.nextInt();
         }
     }
     for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
             matrix2[i][j]=sc.nextInt();
         }
     }
     int[][] subtract=new int[2][2];
     for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
          subtract[i][j]=matrix1[i][j]-matrix2[i][j];   
         }
     }
      System.out.println("the subtract of two matrix is : ");
     for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
         System.out.print(subtract[i][j]+" ");    
         }
         System.out.println();
     }
   } 
}
 

