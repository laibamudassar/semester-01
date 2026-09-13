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
public class ReverseDisplay {
      public static void reverseDisplay(int value) {
        if (value < 10) {
            System.out.print(value);
            return;
        }
        System.out.print(value % 10);
        reverseDisplay(value / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        reverseDisplay(num);
        System.out.println();
    }
} 

