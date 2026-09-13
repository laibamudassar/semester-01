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
public class Question162d {
   public static void main (String[]args){
     Scanner sc=new Scanner (System.in);
     System.out.println("enter number of rows");
     int rows=sc.nextInt();
      System.out.println("enter number of cols");
     int cols=sc.nextInt();
     int [][]matrix1=new int[rows][cols];
     
     System.out.println("enter input for matrix 1");
     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix1[i][j]=sc.nextInt();
            
        } 
     }
    
        boolean equal=true;
        for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
           if(i==j){
               if(matrix1[i][j] != 1)
               equal= false;
           }
           else{
               if(matrix1[i][j]!=0){
                   equal =false;
               }
           }
        } 
        }
        if(equal) {
            System.out.println("Matrix is   identity ");
        }
        else {
            System.out.println("Matrix is   not identity");
        }
   } 
}
 

