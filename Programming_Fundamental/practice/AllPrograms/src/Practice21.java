/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice21 {
    public static void main(String[]args){
       System.out.println("enter a number");  
    Scanner sc=new Scanner (System.in); 
       int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
        if(a>c)
            {
            System.out.println("a is graeter");
        }
       else 
        {
            System.out.println("c is graeter ");
        }
        }  else{
            if(b>c)
        {
            System.out.println("b is graeter");
        }
        else 
        {
            System.out.println("c is greater");
        }
    }
   }
}
