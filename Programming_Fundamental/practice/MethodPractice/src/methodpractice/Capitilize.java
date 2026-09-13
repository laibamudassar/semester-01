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
public class Capitilize {
 
    public static String capitalize(String lower_case_word) {
        if (lower_case_word.isEmpty()) return "";
        return Character.toUpperCase(lower_case_word.charAt(0)) + lower_case_word.substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lowercase words separated by space: ");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        
        for (String word : words) {
            System.out.print(capitalize(word) + " ");
        }
        System.out.println();
    }
}  

