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
import java.util.Random;
import java.util.InputMismatchException;
public class LaibaMudassarQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();
        int[] numbersArray = new int[100];

        for (int i = 0; i < 100; i++) {
            numbersArray[i] = randomGenerator.nextInt(1000) + 1;
        }
        while (true) {
            try {
                System.out.print("Enter an array index (0-99): ");
                int userIndex = input.nextInt();               
                System.out.println("The value at index " + userIndex + " is: " + numbersArray[userIndex]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer index.");
                input.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of Bounds");
            }
        }
        input.close();
    }
 
}
