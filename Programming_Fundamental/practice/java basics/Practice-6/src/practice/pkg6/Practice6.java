/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.pkg6;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Practice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
      int age=sc.nextInt();
      int y=age+2;
      System.out.println(y);
      
      
      int x=6;
      int z=18;
      int modulus=x%z;
      System.out.println(modulus);
    }
    
}
