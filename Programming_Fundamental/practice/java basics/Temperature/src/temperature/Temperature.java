/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperature;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("enter farenhiet value");
     Scanner input=new Scanner(System.in);
     double farenhiet=input.nextDouble();
     double celcius=(5.0/9.0)*(farenhiet-32);
     System.out.println("temperature in celcius is="+celcius);
    





    }
    
}
