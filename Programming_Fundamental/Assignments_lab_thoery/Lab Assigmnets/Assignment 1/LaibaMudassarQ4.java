/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LaibaMudassarQ4 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num=50;
        int attempts=5;
        System.out.println("guess a number between 1 and 100");
        while(attempts>0){
         System.out.println("enter your guess");
         int guess=input.nextInt();
         if(guess==num){
             System.out.println("Correct! you win"); 
         }
        }
    }
}
