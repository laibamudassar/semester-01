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
public class MaximumValue {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        System.out.println("Enter 5 number");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
          
        }
        int max=numbers[0];
        int indexOfMaximum=0;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
               max= numbers[i];
               indexOfMaximum=i;
               }
                }
          System.out.println("index of maximum number is"+indexOfMaximum);
         System.out.println("Maximun number is"+max);
    }
}
