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
public class LaibaMudassar1 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String studentName = "";
        int studentId = 0;
        double studentGPA = 0.0;

        System.out.print("Enter student name: ");
        studentName = input.nextLine();

        while (true) {
            try {
                System.out.print("Enter student ID: ");
                studentId = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer number for ID.");
                input.next();
            }
        }

        while (true) {
            try {
                System.out.print("Enter student GPA: ");
                studentGPA = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a decimal number for GPA.");
                input.next();
            }
        }

        System.out.println("\n--- Student Transcript Summary ---");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("GPA: " + studentGPA);

        if (studentGPA >= 3.5) {
            System.out.println("Status: Intelligent List");
        } else if (studentGPA < 2.0) {
            System.out.println("Status: Warning List");
        } else {
            System.out.println("Status: Regular List");
        }

        input.close();
    }
}  

