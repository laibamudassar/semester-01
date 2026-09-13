/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class SalaryBonus {
    public static void main(String[]args){
       Scanner input=new Scanner(System.in); 
        System.out.println(" Enter salary  ");
        long salary=input.nextLong();
        if(salary>50000)
        {
            System.out.println("  get 20% bonus ");
        }
       else if(salary>=30000||salary<=50000)
        {
            System.out.println("  get 10% bonus ");
        }
       else if(salary<30000)
        {
            System.out.println("  get 5% bonus ");
        }
        else
       {
          System.out.println("  get no bonus ");  
       }
    }
}
