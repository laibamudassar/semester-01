/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class Q1MaxValue {
   public static void main(String[]args){
       int []age={18,17,21,24,16};
       int result=largest(age);
       System.out.println("Maximum value in array= "+result);
   } 
   public static int largest(int[]age){
       int max=age[0];
       for(int i=1;i<age.length;i++){
         if(age[i]<max){
             max=age[i];
            
         } 
        }
      return max;
   }
}
