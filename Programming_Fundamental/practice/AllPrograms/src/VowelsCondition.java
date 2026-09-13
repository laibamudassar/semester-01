/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class VowelsCondition {
     public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
                System.out.println("enter a letter");
             char vowels=sc.next().charAt(0);
             if (vowels=='A'||vowels=='E'||vowels=='I'||vowels=='O'||vowels=='U'||vowels=='a'||vowels=='e'||vowels=='i'||vowels=='o'||vowels=='u')
                                  {
                 System.out.println("letter is vowel");
             }
             else
             {
                     System.out.println("letter is cosonants");
                     }
}
}
