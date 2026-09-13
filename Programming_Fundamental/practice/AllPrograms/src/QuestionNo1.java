/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */

import java.util.Scanner;
public class QuestionNo1 {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);   
      System.out.println("Enter  your full name");
        String name=sc.nextLine();
        System.out.println("Enter your registration number only");
        int registrationNumber=sc.nextInt();
        System.out.println("enter your grade");
        char  grade=sc.next().charAt(0);
           System.out.printf( "registrationNumber=%S\ngrade=%C\n",registrationNumber,grade );
    }
}
