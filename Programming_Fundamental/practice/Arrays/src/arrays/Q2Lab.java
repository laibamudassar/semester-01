/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
import java.io.FileWriter;
import java.util.Scanner;
public class Q2Lab {
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
      
     try{
        FileWriter write=new FileWriter("lastOver.txt");
                  int []score=new int[6];
                  int sum=0;
         for(int i=0;i<score.length;i++){
             System.out.println("enter integer score of a ball");
             score[i]=sc.nextInt();
              sum+=score[i];
           write.write("Score on 6 balls"+score[i]);
         }
         System.out.println("total number of runs = "+sum);
         write.write("total socre"+sum);
         write.close();
     }
     catch(Exception e){
         System.out.println("An error occured : "+e.getMessage());
          System.out.println("re enter integer  value again ");
     }
    
  }  
}
