/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tripcalculation;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class TripCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("Enter distance");
     Scanner sc=new Scanner(System.in);
     double distance =sc.nextDouble();
     System.out.println("enter miles per gallon ");
          double milesPerGallon=sc.nextDouble();
          double gallonUsed =distance/milesPerGallon;
          System.out.println("Enter price per Gallon");
          double pricePerGallon=sc.nextDouble();
     double cost=pricePerGallon*gallonUsed;
     System.out.println("total cost for trip ="+cost);
     
     
     
     
    }
    
}
