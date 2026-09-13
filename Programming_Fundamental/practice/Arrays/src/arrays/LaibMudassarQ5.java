/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
   import java.util.Scanner;
import java.util.InputMismatchException;
public class LaibMudassarQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialAmount = 0;
        double profitRate = 0;
        int businessYears = 5;
        try {
            System.out.print("Enter business investment amount: ");
            initialAmount = input.nextDouble();
            System.out.print("Enter expected annual profit percentage (e.g., 10 for 10%): ");
            profitRate = input.nextDouble();
            calculateInvestment(initialAmount, profitRate, businessYears);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid numeric format entered.");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        input.close();
    }
    public static void calculateInvestment(double amount, double rate, int years) {
        if (amount <= 0 || rate <= 0 || years <= 0) {
            throw new IllegalArgumentException("Investment amount, profit rate, or years cannot be less than or equal to zero.");
        }
        double totalAccumulated = amount;
        for (int i = 1; i <= years; i++) {
            double annualProfit = totalAccumulated * (rate / 100);
            totalAccumulated = totalAccumulated + annualProfit;
        }
        double totalNetProfit = totalAccumulated - amount;
        System.out.println("\n--- Investment Report ---");
        System.out.println("Initial Investment: " + amount);
        System.out.println("Total Earnings after " + years + " years: " + totalAccumulated);
        System.out.println("Total Net Profit Earned: " + totalNetProfit);
    }
} 

