/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
public class Fictorial {
  public static void main(String[]args){
      fictorial();
  } 
  public static void fictorial(){
      int result=1;
      int num=4;
      for( int i=1;i<=4;i++){
        result*=i;  
      }
      System.out.println("fictorial of 4 is ="+result);
  } 
}
