/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxculculations;

/**
 *
 * @author PC
 */ 
import java.util.Scanner;
public class TaxCulculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter price");
      Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        double tax=price*0.17;
        double totalPrice=price+tax;
        System.out.println("total amount="+totalPrice);
        
      
    }
    
}
