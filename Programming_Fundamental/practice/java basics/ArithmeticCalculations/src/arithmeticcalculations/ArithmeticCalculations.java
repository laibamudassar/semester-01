/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticcalculations;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class ArithmeticCalculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              System.out.println("enter radius");
        Scanner input=new Scanner(System.in);
        double radius=input.nextDouble();
        System.out.println("enter lenght");
        double lenght=input.nextDouble();
        double area=radius*radius*lenght;
        double volume=area*lenght;
        System.out.println("area is="+area+"\n"+"volume is="+volume);
        
        
        
        
        
        
        
        
    }    
}
