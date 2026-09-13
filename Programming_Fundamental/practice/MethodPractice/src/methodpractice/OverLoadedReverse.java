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
public class OverLoadedReverse {
    public static void reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        System.out.println(reversed);
    }
    public static void reverse(String subject) {
        String reversed = "";
        for (int i = subject.length() - 1; i >= 0; i--) {
            reversed += subject.charAt(i);
        }
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter a subject name: ");
        String subject = scanner.nextLine();
        
        reverse(year);
        reverse(subject);
    }
} 

