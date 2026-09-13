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
public class Question7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    int []arr=new int[6];   
    System.out.println("Enter 6 numbers(also include less than 0)");
    for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            count++;
        }
            }
    System.out.println("total negative elements in array = "+count);
    }
}
