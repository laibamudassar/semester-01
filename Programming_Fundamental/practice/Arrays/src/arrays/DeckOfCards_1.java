/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class DeckOfCards_1 {
   public static void main(String[]args){
    int deck[]=new int[52];
    for(int i=0;i<deck.length;i++){
        deck[i]=i;
    }
     System.out.println("deck card initialization :");
     for(int i=0;i<deck.length;i++){
         System.out.println(deck[i]);
     }
     
     
   } 
}
