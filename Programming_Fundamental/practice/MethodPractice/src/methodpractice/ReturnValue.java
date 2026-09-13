/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class ReturnValue {
 public static void main(String[]args){
    int result= sum(2,3);
     System.out.println(result);
 } 
 public static int sum(int num1,int num2){
   
  int result=num1+num2;
  return result;
 }
}
