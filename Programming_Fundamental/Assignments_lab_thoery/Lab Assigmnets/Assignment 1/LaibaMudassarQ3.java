/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LaibaMudassarQ3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Gold");
        System.out.println("2. Silver");
        System.out.println("3. Cash");
        System.out.println("4.all( Cash + Gold + Silver");
        System.out.print("choose option ");
        int choice = input.nextInt();
        double zakat = 0;
        switch(choice) {
            case 1:
                System.out.print("Enter gold in tola: ");
                double gold = input.nextDouble();
                if(gold >= 7.5) {
                    double totalGold = gold * 435000;
                    zakat = totalGold * 0.025;
                }
                break;
            case 2:
                System.out.print(("Enter silver in tola: "));
                double silver = input.nextDouble();
                if(silver >= 52) {
                    double totalSilver = silver * 5500;
                    zakat = totalSilver * 0.025;
                }
                break;
            case 3:
                System.out.print("Enter cash: ");
                double cash = input.nextDouble();
                if(cash >= 180000) {
                    zakat = cash * 0.025;
                }
                break;
            case 4:
                System.out.print("Enter cash: ");
                double c = input.nextDouble();
                System.out.print("Enter gold in tola: ");
                double g = input.nextDouble();
                System.out.print("Enter silver in tola: ");
                double s = input.nextDouble();
                double total = c + (g * 435000) + (s * 5500);
                if(total >= 180000) {
                    zakat = total * 0.025;
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Zakat to pay = " + zakat);
    }
}

