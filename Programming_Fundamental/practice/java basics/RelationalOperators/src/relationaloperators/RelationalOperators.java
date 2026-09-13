/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relationaloperators;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class RelationalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("enter radius value");
     Scanner input=new Scanner(System.in);
     double radius=input.nextDouble();
     if (radius<0) {
     System.out.println("enter invalid value");
     }
     else if (radius>0){
    System.out.println("enter radius is positive");
     }
     double area=radius*radius*3.1415;
     System.out.println("area is="+area);
     
     
     
     
     
    }
    
}
