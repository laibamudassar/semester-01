/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class AsciiCode {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an ASCII code (0-127): ");
        int asciiCode = scanner.nextInt();
        System.out.println((char) asciiCode);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println((int) ch);
    }
}

