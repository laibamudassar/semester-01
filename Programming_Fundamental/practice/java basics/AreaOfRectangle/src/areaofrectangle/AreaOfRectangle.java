/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaofrectangle;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class AreaOfRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Enter lenght "); 
       Scanner input=new Scanner(System.in);
       double lenght=input.nextDouble();
       System.out.println("enter widht");
      double widht=input.nextDouble();
      double areaOfRectangle=lenght*widht;
      System.out.println("area of rectangle="+areaOfRectangle);
      



    }
    
}
