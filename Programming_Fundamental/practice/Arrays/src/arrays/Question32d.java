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
public class Question32d {
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number of rows");
   int rows=sc.nextInt(); 
   System.out.println("Enter number of colms");
   int cols=sc.nextInt();
   int [][]matrix=new int[rows][cols];
   System.out.println("enter input");
   for(int i=0;i<rows;i++){
       for(int j=0;j<cols;j++){
           matrix[i][j]=sc.nextInt();
       }
   }
   int result[][]=new int[rows][cols];
   System.out.println(" enter a scalar number");
   int scalar=sc.nextInt();
  
   for(int i=0;i<rows;i++){
       for(int j=0;j<cols;j++){
        result[i][j]=matrix[i][j]*scalar;   
       }
     
   }
   System.out.println(" scalar multiplication of matrix");
   for(int i=0;i<rows;i++){
       for(int j=0;j<cols;j++){
        System.out.print(result[i][j]+" ");    
         }
         System.out.println();
       }
         }
  } 

