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
public class Question52d {
   public static void main (String[]args){
     Scanner sc=new Scanner (System.in);
     System.out.println("enter number of rows");
     int rows=sc.nextInt();
      System.out.println("enter number of cols");
     int cols=sc.nextInt();
     int [][]matrix1=new int[rows][cols];
     int [][]matrix2=new int[rows][cols];
     System.out.println("enter input fir matrix 1");
     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix1[i][j]=sc.nextInt();
            
        } 
     }
     System.out.println("enter input for matrix2");
        for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix2[i][j]=sc.nextInt();
           
        } 
     }
        boolean equal=false;
        for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
           if(matrix1[i][j]==matrix2[i][j]){
               equal= true;
           }
        } 
        }
        if(equal) {
            System.out.println("Matrices are equal.");
        }
        else {
            System.out.println("Matrices are not equal.");
        }
   } 
}
