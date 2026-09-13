/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbasics;

/**
 *
 * @author PC
 */
public class StringBasics {
      public static void main(String[] args) {
        String str="hello";
        printString(str);
       
    }
      public static void printString(String str){
          
          for(int i=0;i<str.length();i++){
              char chr=str.charAt(i);
              System.out.println(chr);
              
          }
      }
    
}
