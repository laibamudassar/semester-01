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
public class LargestArray {
      public static int largest(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        int maxInRest = largest(arr, index + 1);
        return (arr[index] > maxInRest) ? arr[index] : maxInRest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        System.out.print("Enter 8 integers: ");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Largest: " + largest(numbers, 0));
    }
} 

