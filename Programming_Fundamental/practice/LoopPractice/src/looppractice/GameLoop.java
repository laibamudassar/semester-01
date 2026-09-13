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
import java.util.Random;
public class GameLoop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random input=new Random();
      int ranNum=input.nextInt(100)+1;
      boolean notGuessed=true;
      while(notGuessed)
      {System.out.println("enter a number");
         
                      int guessed=sc.nextInt();
            if(ranNum==guessed)
            {
                System.out.println("you win");
                notGuessed=false;
                
            }
            else 
            {
                System.out.println(guessed<ranNum?"low!":"high!");
            }
          }
           
                   
                   }
          }
          
     
          
               
