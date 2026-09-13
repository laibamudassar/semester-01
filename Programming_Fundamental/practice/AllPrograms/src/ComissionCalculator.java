/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
 import java.util.Scanner;
public class ComissionCalculator {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double totalSales = 0;
        double itemPrice = 1;

        System.out.println("Enter item prices. Type 0 when you are done:");

        while (itemPrice != 0) {
            System.out.print("Item Price: ");
            itemPrice = reader.nextDouble();
            totalSales = totalSales + itemPrice;
        }

        double bonus = totalSales * 0.09;
        double finalPay = 200 + bonus;

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Your total pay for this week is: $" + finalPay);
        
        reader.close();
    }
}   

