/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

/**
 *
 * @author PC
 */
public class CheakFloat {
   public static void main(String[]args) {
     double item=10;  
    double sum=0;
    while (item!=0)
    {
        sum+=item;
        item-=0.1;
        System.out.println("sum="+sum);
    } 
      System.out.println(sum);  
        }
}
