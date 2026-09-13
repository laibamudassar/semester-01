/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package allprograms;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class AllPrograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("enter your password");
      Scanner input =new Scanner(System.in);
      String password=input.next();
      int lenght= password.length();
      if (lenght==8) 
      {
       System.out.println("password accepted");
      }      
      else
      {
          System.out.println("password is incorrect");
     
               }
    
}
}
