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
public class ShapeArea {
      public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(double base, double height, String shape) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose shape: 1. Circle 2. Rectangle 3. Triangle");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = scanner.nextDouble();
                System.out.println(calculateArea(r));
                break;
            case 2:
                System.out.print("Enter length and width: ");
                double l = scanner.nextDouble();
                double w = scanner.nextDouble();
                System.out.println(calculateArea(l, w));
                break;
            case 3:
                System.out.print("Enter base and height: ");
                double b = scanner.nextDouble();
                double h = scanner.nextDouble();
                System.out.println(calculateArea(b, h, "Triangle"));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
} 

