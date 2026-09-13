/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaofsquare;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class AreaOfSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter lenght");
               Scanner sc=new Scanner(System.in);
        double lenght=sc.nextDouble();
        double areaOfSquare=lenght*lenght;
        System.out.println("area of square is="+areaOfSquare);
        
        
        
    }
    
}
