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
public class MultiTable {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        for(int i =0;i<=10;i++)
        {
            System.out.println(number+"*"+i+"="+(number*i));
        }
        
        
    }
}
