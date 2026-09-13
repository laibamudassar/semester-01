/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looppractice;

/**
 *
 * @author PC
 */
public class AsciiPrinter {
   public static void main(String[]args){
      for(int i=0;i<=127;i++)
      {
          char character= (char)i;
          System.out.println(i+":"+character);
      }
       
       
   } 
}
