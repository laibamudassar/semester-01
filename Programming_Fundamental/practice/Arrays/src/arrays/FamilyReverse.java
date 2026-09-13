/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class FamilyReverse {
   public static  void main(String[]args){
       String []family={"laiba","Mudassar","Safia","habib"};
       String []result=reverse(family);
       System.out.println("reverse array");
       for(int i=0;i<result.length;i++){
           System.out.print(result[i]+"    ");
       }
   }  
   public static String[] reverse(String[] family){
       String []result=new String[family.length];
       for(int i=0,j=family.length-1;i<family.length;i++,j--){
           result[j]=family[i];
          }
       return result;
   }
}
