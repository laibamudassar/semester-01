/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtask;

/**
 *
 * @author PC
 */

import java.util.Scanner;
public class LabTask {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter width");
        Scanner console=new Scanner(System.in);
        double width;
         width=console.nextDouble();
        System.out.println("enter length");
        double length;
        length=console.nextDouble();
        double area;
          area=width*length;
         double perimeter;
         perimeter=2*(length+width);
         System.out.println("area = "+area);
        System.out.println("perimeter = "+perimeter);
       
    }
    
}
