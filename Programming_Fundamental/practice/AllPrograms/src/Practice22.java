/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice22 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        if(number%3==0&&number%5==0)
        {
            System.out.println("number is divisible by both 3 and5 ");
        }
        else
        {
            System.out.println("number is not divisible ");
        }
    }
}
