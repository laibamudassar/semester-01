/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package markscalculator;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class MarksCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter your physics marks");
        Scanner input=new Scanner(System.in);
        double physics=input.nextDouble();
        System.out.println("enter math marks");
        double math=input.nextDouble();
        System.out.println("enter english marks");
        double english=input.nextDouble();
        System.out.println("enter bio marks");
        double bio=input.nextDouble();
        System.out.println("enter urdu marks");
        double urdu=input.nextDouble();
        System.out.println("enter chemistry marks");
        double chemistry=input.nextDouble();
        double average= (physics+math+urdu+bio+chemistry+english)/600*100;
        System.out.println("average of your marks=" +average);
    }
    
}
