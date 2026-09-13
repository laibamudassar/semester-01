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
public class AreaOfPentagon {
       public static double area(double side) {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double s = scanner.nextDouble();
        System.out.println("The area of the pentagon is " + area(s));
    }
} 

