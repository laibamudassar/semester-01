/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author PC
 */
import java.io.IOException;
import java.io.FileReader;
public class Throws {
   public static void main(String[]args){
       try{
           readFile();
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
   } 
   public static void readFile()throws IOException{
       FileReader reader=new FileReader("java.txt");
       System.out.println("File opened");
   }
}
