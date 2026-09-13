/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
public class VowelsCount {
      public static int countVowels(String s) {
        int count = 0;
        String lowerS = s.toLowerCase();
        for (int i = 0; i < lowerS.length(); i++) {
            char c = lowerS.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello World"));
    }
} 

