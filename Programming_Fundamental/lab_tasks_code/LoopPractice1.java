/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LoopPractice1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        System.out.println("Enter positive integers (Enter -1 to stop):");
        int number = input.nextInt(); 
        
        while (number != -1) {
            sum += number;   
            count++;          
                       number = input.nextInt(); 
        }
                       if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Sum of numbers: " + sum);
            System.out.println("Average of numbers: " + average);
        } else {
            System.out.println("No positive integers were entered.");
        }
    }
}

