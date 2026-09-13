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
public class Question82d {
  public static void main (String[]args){
     Scanner sc=new Scanner (System.in);
         int [][]matrix1=new int[3][3];
    
     System.out.println("enter input for matrix 1");
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            matrix1[i][j]=sc.nextInt();
        } 
     } 
     int sum=0;
     for(int i=0;i<3;i++){
         sum=0; 
         for(int j=0;j<3;j++){
          
                 sum=sum+matrix1[i][j];
         }  
         System.out.println("sum of each  rows of matrix  = "+sum); 
     }
    
     int sumCols=0;
     for(int i=0;i<3;i++){// for cols fixed
         sumCols=0;
         
                   for(int j=0;j<3;j++){
             
                 sumCols=sumCols+matrix1[i][j];
             
         
     }
     System.out.println("sum of  each cols of matrix  = "+sumCols);
     }
}
}  

