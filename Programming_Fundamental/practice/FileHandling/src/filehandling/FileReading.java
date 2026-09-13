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
public class FileReading {
   public static void main(String[]args){
       try{
           FileReader reader=new FileReader("java.txt");
           int data;
           while((data=reader.read())!=-1){
               System.out.print((char)data);
           }
           reader.close();
       }
       catch(IOException e){
           System.out.println("file not found"+e.getMessage());
       }
   } 
}
