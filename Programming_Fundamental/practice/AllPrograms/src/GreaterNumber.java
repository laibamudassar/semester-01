/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class GreaterNumber {
     public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
                System.out.println("enter a num");
int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b&&a>c)
    {
      System.out.println(a+"  a is greater");
    }
    else if (b>a&&b>c)
    {
         System.out.println(b+"  b is greater");
    }
    else if (c>a&&c>b)
    {
        System.out.println(c+"  c is greater"); 
    }
}
}
