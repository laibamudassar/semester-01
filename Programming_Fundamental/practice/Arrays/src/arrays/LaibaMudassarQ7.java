/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class LaibaMudassarQ7 {
      public static void main(String[] args) {
        String[] originalArray = {"India", "is", "looser"};

        System.out.println("Original Input Array content:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();

        String[] reversedOutputArray = reverseStringArray(originalArray);

        System.out.println("\nResultant Returned Array Content:");
        for (int i = 0; i < reversedOutputArray.length; i++) {
            System.out.print(reversedOutputArray[i] + " ");
        }
        System.out.println();
    }

    public static String[] reverseStringArray(String[] arrayToReverse) {
        int length = arrayToReverse.length;
        String[] outcomeArray = new String[length];

        for (int i = 0; i < length; i++) {
            outcomeArray[i] = arrayToReverse[length - 1 - i];
        }

        return outcomeArray;
    }
}

