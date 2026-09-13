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
public class LaibaMudassar6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seatingChart = new boolean[21]; 
        String[] passengerNames = new String[21]; 
        int totalSeatsAssigned = 0;
        System.out.println("Welcome to the Automated Airline Reservation System.");
        while (totalSeatsAssigned < 20) {
            int targetSection = 0;
            System.out.println("\nAvailable Classes:");
            System.out.println("1. Business Class (Seats 1-8)");
            System.out.println("2. Economy Class (Seats 9-20)");
                        while (true) {
                try {
                    System.out.print("Please type 1 for Business or 2 for Economy: ");
                    targetSection = input.nextInt();
                    if (targetSection == 1 || targetSection == 2) {
                        break;
                    }
                    System.out.println("Invalid selection. Type 1 or 2 only.");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input type. Integers only.");
                    input.next();
                }
            }
            input.nextLine(); 
            System.out.print("Enter passenger full name: ");
            String travelerName = input.nextLine();

            int assignedSeatNumber = -1;

            if (targetSection == 1) {
                for (int i = 1; i <= 8; i++) {
                    if (!seatingChart[i]) {
                        assignedSeatNumber = i;
                        break;
                    }
                }

                if (assignedSeatNumber == -1) {
                    System.out.print("Business Class is full. Switch to Economy Class? (yes/no): ");
                    String userResponse = input.next();
                    if (userResponse.equalsIgnoreCase("yes")) {
                        for (int j = 9; j <= 20; j++) {
                            if (!seatingChart[j]) {
                                assignedSeatNumber = j;
                                break;
                            }
                        }
                    }
                }
            } else {
                for (int i = 9; i <= 20; i++) {
                    if (!seatingChart[i]) {
                        assignedSeatNumber = i;
                        break;
                    }
                }

                if (assignedSeatNumber == -1) {
                    System.out.print("Economy Class is full. Switch to Business Class? (yes/no): ");
                    String userResponse = input.next();
                    if (userResponse.equalsIgnoreCase("yes")) {
                        for (int j = 1; j <= 8; j++) {
                            if (!seatingChart[j]) {
                                assignedSeatNumber = j;
                                break;
                            }
                        }
                    }
                }
            }
            try {
                if (assignedSeatNumber != -1) {
                    seatingChart[assignedSeatNumber] = true;
                    passengerNames[assignedSeatNumber] = travelerName;
                    totalSeatsAssigned++;

                    System.out.println("\n=================================");
                    System.out.println("          BOARDING PASS          ");
                    System.out.println("=================================");
                    System.out.println("Passenger Name: " + passengerNames[assignedSeatNumber]);
                    System.out.print("Flight Section: ");
                    if (assignedSeatNumber <= 8) {
                        System.out.println("First-Class / Business Section");
                    } else {
                        System.out.println("Economy Section");
                    }
                    System.out.println("Assigned Seat Number: " + assignedSeatNumber);
                    System.out.println("=================================");
                } else {
                    System.out.println("Next flight leaves in 3 hours");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("System Seating Error managed securely.");
            }
        }

        System.out.println("\nThe flight is now fully booked!");
        input.close();
    }
}    

