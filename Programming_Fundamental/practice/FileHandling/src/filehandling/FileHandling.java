/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehandling;

/**
 *
 * @author PC
 */
 import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
        public static void main(String[] args) {
        // Syntax: FileWriter(String fileName, boolean append)
        // If append is true, it adds to the end. If false, it overwrites.
        try {
            FileWriter writer = new FileWriter("notes.txt", false); 
            
            writer.write("Hello Java!\n");
            writer.write("This is basic file handling.");
            
            writer.close(); // CRITICAL: Always close the file to save the data!
            System.out.println("Successfully written!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
   
    
       
       




