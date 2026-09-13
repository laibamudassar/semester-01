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
import java.io.FileWriter;
public class FileWriting {
    public static void main(String[]args){
        
        try{
           FileWriter writer=new FileWriter("java.txt",false);
           writer.write("Hello java");
           writer.write(" This is file handling");
           writer.close();
        }
        catch(IOException e){
System.out.println("an error occured"+e.getMessage());
        }
    }
    
}
