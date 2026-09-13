/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class PaperScissorGame {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in); 
        System.out.println("enter player 1 choice");
        char player1=sc.next().charAt(0);
       System.out.println("enter palyer2 choice");
        char player2=sc.next().charAt(0);
        if(player1==player2)
        {
           System.out.println("tie");
        }
        else if(player1=='R'&&player2=='S')
        {
          System.out.println("player1 wins; "); 
        }
        else if(player1=='P'&&player2=='R')
        {
          System.out.println("palyer1 wins");
                 
        }
        else if(player1=='S'&&player2=='P')
        {
            System.out.println("Player1 wins");
        }
        else
        {
            System.out.println("palyer 2 wins");
           
        }
    }
}
