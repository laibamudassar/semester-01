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
public class LaibaMudassarQ3 {
   public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstInteger = 0;
        int secondInteger = 0;
                       while (true) {
            try {
                System.out.print("Enter the first integer: ");
                firstInteger = inputScanner.nextInt();
                break; 
            } catch (InputMismatchException e) {
                System.out.println("You have entered an invalid input, type integers only.");
                inputScanner.next(); 
            }
        }
              while (true) {
            try {
                System.out.print("Enter the second integer: ");
                secondInteger = inputScanner.nextInt();
                break; 
            } catch (InputMismatchException e) {
                System.out.println("You have entered an invalid input, type integers only.");
                inputScanner.next(); 
            }}
                int totalSum = firstInteger + secondInteger;
        System.out.println("The sum of the two integers is: " + totalSum);
        inputScanner.close();
    }
} 

