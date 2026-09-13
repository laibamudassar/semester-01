/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
 import java.util.InputMismatchException;
import java.util.Scanner;

public class LaibaMudassarQ1B {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 integer values below:");
        
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter integer for index " + i + ": ");
                    numbers[i] = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input! Please try entering this integer again.");
                    input.next();
                }
            }
        }

        while (true) {
            try {
                System.out.print("\nEnter an index to check its value: ");
                int index = input.nextInt();
                
                System.out.println("The value at index " + index + " is: " + numbers[index]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer number for the index.");
                input.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Wrong index! Valid indices are only from 0 to 9.");
            }
        }
        
        input.close();
    }
}  

