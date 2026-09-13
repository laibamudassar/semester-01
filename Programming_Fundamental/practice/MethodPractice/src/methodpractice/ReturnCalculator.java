/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
public class ReturnCalculator {
 public static void main(String[]args){
     int sum=sum(2,3);
     System.out.println("sum ="+sum);
     
 } 
 public static int sum(int val1,int val2){
     int sum=val1+val2;
     return sum;
 }
 public static int subtraction(int val1,int val2){
     int subtraction=val1-val2;
     return subtraction;
 }
 public static int division(int val1,int val2){
     int division=val1/val2;
     return division;
 }
 public static int multiplicaton(int val1,int val2){
     int multiplication=val1*val2;
     return multiplication;
 }
}
