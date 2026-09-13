/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicalgame;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class LogicalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gameNo=15;
        System.out.println("enter your guess number");
        Scanner input=new Scanner(System.in);
        int guessNo=input.nextInt();
        boolean result=gameNo==guessNo;
        System.out.println("user number will "+result);
        
        
        
        
    }
    
}
