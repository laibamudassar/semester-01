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
public class Hexadecimal {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 15: ");
        int num = scanner.nextInt();
        
        if (num >= 0 && num <= 9) {
            System.out.println(num);
        } else if (num >= 10 && num <= 15) {
            System.out.println((char) ('A' + (num - 10)));
        } else {
            System.out.println("Invalid input.");
        }
    }
} 

