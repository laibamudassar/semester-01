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
public class SortThreeNumbers {
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        displaySortedNumbers(n1, n2, n3);
    }
     public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }
        if (num2 > num3) { temp = num2; num2 = num3; num3 = temp; }
        if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }
        
        System.out.println(num1 + " " + num2 + " " + num3);
} 
}

