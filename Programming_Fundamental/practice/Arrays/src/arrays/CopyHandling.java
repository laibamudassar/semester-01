/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class CopyHandling {
   public static void main(String[]args){
       int[]source={3,4,5,6,7};
       int[]target=new int[source.length];
       System.arraycopy(source, 0, target, 0, source.length);
       //for(int i=0;i<source.length;i++){
       //    target[i]=source[i];
      //  }
       
       for(int i=0;i<target.length;i++){
        System.out.println(target[i]+" ");   
       }
       
   } 
}
