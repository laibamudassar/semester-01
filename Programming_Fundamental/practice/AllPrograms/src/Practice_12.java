/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice_12 {
 public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter farenhiet value");
    float farenhiet=input.nextFloat();
    float celcius=(farenhiet-32)*5/9;
    System.out.println("celcius value="+celcius);
 }   
}
