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
public class MagicDateChecker {
     
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (numeric): ");
        int m = scanner.nextInt();
        System.out.print("Enter day: ");
        int d = scanner.nextInt();
        System.out.print("Enter two-digit year: ");
        int y = scanner.nextInt();
        checkMagicDate(m, d, y);
    }
    public static void checkMagicDate(int month, int day, int year) {
        if (month * day == year) {
            System.out.println("The date is magic.");
        } else {
            System.out.println("The date is not magic.");
        }
}
}

