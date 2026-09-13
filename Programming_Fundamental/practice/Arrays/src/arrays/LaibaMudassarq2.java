/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
 import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class LaibaMudassarq2 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        double goldTola = 0;
        double silverTola = 0;
        double cashAmount = 0;
        double totalAssetsValue = 0;
        double zakatToBePaid = 0;
        String recordText = "";

        System.out.println("--- Zakat Calculator Menu ---");
        System.out.println("1. Gold Asset Only");
        System.out.println("2. Silver Asset Only");
        System.out.println("3. Cash Asset Only");
        System.out.println("4. Mixed Assets (Cash, Gold, and Silver)");
        
        while (true) {
            try {
                System.out.print("Select an option (1-4): ");
                choice = input.nextInt();
                if (choice >= 1 && choice <= 4) {
                    break;
                }
                System.out.println("Please enter a number between 1 and 4 only.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. Integers only.");
                input.next();
            }
        }

        switch (choice) {
            case 1:
                while (true) {
                    try {
                        System.out.print("How many Tola of Gold do you have? ");
                        goldTola = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid decimal or integer number.");
                        input.next();
                    }
                }
                
                if (goldTola >= 7.5) {
                    totalAssetsValue = goldTola * 315000;
                    zakatToBePaid = totalAssetsValue * 0.025;
                } else {
                    System.out.println("Gold amount is below 7.5 Tola limit. No Zakat due.");
                }
                
                recordText = "Asset Type: Gold Only, Gold Tola: " + goldTola + ", Total Value: RS " + totalAssetsValue;
                break;

            case 2:
                while (true) {
                    try {
                        System.out.print("How many Tola of Silver do you have? ");
                        silverTola = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid decimal or integer number.");
                        input.next();
                    }
                }
                
                if (silverTola >= 52) {
                    totalAssetsValue = silverTola * 3320;
                    zakatToBePaid = totalAssetsValue * 0.025;
                } else {
                    System.out.println("Silver amount is below 52 Tola limit. No Zakat due.");
                }
                
                recordText = "Asset Type: Silver Only, Silver Tola: " + silverTola + ", Total Value: RS " + totalAssetsValue;
                break;

            case 3:
                while (true) {
                    try {
                        System.out.print("How much cash do you have? ");
                        cashAmount = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid decimal or integer number.");
                        input.next();
                    }
                }
                
                if (cashAmount >= 170000) {
                    totalAssetsValue = cashAmount;
                    zakatToBePaid = totalAssetsValue * 0.025;
                } else {
                    System.out.println("Cash amount is below RS 170,000 limit. No Zakat due.");
                }
                
                recordText = "Asset Type: Cash Only, Cash Amount: RS " + cashAmount + ", Total Value: RS " + totalAssetsValue;
                break;

            case 4:
                while (true) {
                    try {
                        System.out.print("Enter your cash amount: ");
                        cashAmount = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid number.");
                        input.next();
                    }
                }
                while (true) {
                    try {
                        System.out.print("Enter your Gold amount (in Tola): ");
                        goldTola = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid number.");
                        input.next();
                    }
                }
                while (true) {
                    try {
                        System.out.print("Enter your Silver amount (in Tola): ");
                        silverTola = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid number.");
                        input.next();
                    }
                }

                double totalGoldCashValue = goldTola * 315000;
                double totalSilverCashValue = silverTola * 3320;
                totalAssetsValue = cashAmount + totalGoldCashValue + totalSilverCashValue;
                zakatToBePaid = totalAssetsValue * 0.025;
                
                recordText = "Asset Type: Mixed, Cash: RS " + cashAmount + ", Gold Tola: " + goldTola + ", Silver Tola: " + silverTola + ", Combined Total Assets Value: RS " + totalAssetsValue;
                break;
        }

        System.out.println("\n--- Results Output ---");
        System.out.println("Total Assessed Asset Value: RS " + totalAssetsValue);
        System.out.println("Final Zakat amount to be paid: RS " + zakatToBePaid);

        try {
            FileWriter fileWriter = new FileWriter("zakat_records.txt");
            fileWriter.write(recordText + " | Calculated Zakat to pay: RS " + zakatToBePaid);
            fileWriter.close();
            System.out.println("\nData successfully saved to file 'zakat_records.txt'!");
        } catch (IOException e) {
            System.out.println("Error saving content to the file.");
        }

        input.close();
    }
}

