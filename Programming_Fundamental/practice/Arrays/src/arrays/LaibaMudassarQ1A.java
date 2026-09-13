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

public class LaibaMudassarQ1A {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        while (true) {
            try {
                System.out.print("Enter first integer: ");
                num1 = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You have entered an invalid input, type integers only");
                input.next();
            }
        }

        while (true) {
            try {
                System.out.print("Enter second integer: ");
                num2 = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You have entered an invalid input, type integers only");
                input.next();
            }
        }

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        input.close();
    }
}

