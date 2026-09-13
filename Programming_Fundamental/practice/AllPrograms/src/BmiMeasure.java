/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class BmiMeasure {
    public static void main(String[]args){
 System.out.println("enter your Body mass index");
  Scanner input=new Scanner(System.in);
  double Bmi=input.nextDouble();
  if(Bmi==24.5)
  {
      
          System.out.println("wieght is normal");
  }     
        
   else
  {
      System.out.println("weight is not normal");
  }     
}
}
