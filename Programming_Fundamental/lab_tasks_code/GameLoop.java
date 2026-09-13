/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class GameLoop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int secretNumber = 7; 
        int totalChances = 3;
        System.out.println("enter a number between 0 and 100");
        for(int i=0;i<=totalChances;i++)
        System.out.print( " Enter your guess: ");
          int guess = input.nextInt();
            if (guess == secretNumber) {
                System.out.println("Correct! You win!"); }
                else {
                System.out.println("Wrong guess!");
            }
    }
            
}
