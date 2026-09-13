/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changecalculator;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class ChangeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int amount=588;
      int notesOfHundred=amount/100;
      amount=amount%100;
      int notesOfFifty=amount/50;
      amount=amount%50;
      int notesOfTens=amount/10;
      amount=amount%10;
      int coinsOfFive=amount/5;
      amount=amount%5;
      int coinsOfTwo=amount/2;
      amount=amount%2;
      int coinsOfOne=amount/1;
      System.out.println("notes OF Hundred"+notesOfHundred +"\n"+ "notes Of FIFTY"+notesOfFifty+"\n" +"notes of ten " +notesOfTens+"\n"+ "cons of five"+coinsOfFive+"\n" +"coins of two"+coinsOfTwo+"\n"+"coinsofone"+coinsOfOne);
        


    }
    
}
