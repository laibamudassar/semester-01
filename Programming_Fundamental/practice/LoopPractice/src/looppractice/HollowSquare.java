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
public class HollowSquare {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=sc.nextInt();
       for(int i=1;i<=number;i++){
        for(int j=1;j<=number;j++){
            if(i==1||i==number||j==1||j==number){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
         System.out.println();
    } 
    }
}
