/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class DeckCards_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        String[] suits={"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        System.out.println("enter card number");
        int cardNumber=sc.nextInt();
        if(cardNumber>=0&&cardNumber<=51){
            String suit=suits[cardNumber/13];
             String rank=ranks[cardNumber%13];
              System.out.println("cardNumber"+cardNumber+" : "+rank+" of "+suit);
        }
        else{
            System.out.println("invalid number entered");
        }
        
      
    }
}
