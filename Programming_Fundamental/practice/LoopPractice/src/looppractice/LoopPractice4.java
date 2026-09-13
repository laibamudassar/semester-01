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
public class LoopPractice4 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enet a number");
        int num=sc.nextInt();
        int product=1;
        while(num>0)
        {
            int digit=num%10;
            product=digit*product;
            num=num/10;
        }
        System.out.println(product);
    }
}
