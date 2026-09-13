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
public class Conversion {
     public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length: ");
        double length = input.nextDouble();
        
        System.out.print("Did you enter feet or meters? (type 'feet' or 'meters'): ");
        String unit = input.next();
        
        if (unit.equalsIgnoreCase("feet")) {
            System.out.println(footToMeter(length));
        } else if (unit.equalsIgnoreCase("meters")) {
            System.out.println(meterToFoot(length));
        } else {
            System.out.println("Invalid unit.");
        }
    }
}  

