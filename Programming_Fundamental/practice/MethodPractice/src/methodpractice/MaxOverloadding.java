/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class MaxOverloadding {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter int  value 1");
        int val1=sc.nextInt();
        System.out.println("enter int value 2");
        int val2=sc.nextInt();
     System.out.println("maximum number of value1 and value2="+max(val1,val2));
     System.out.println("enter  double value 1");
        double v1=sc.nextDouble();
        System.out.println("enter double value 2");
        double v2=sc.nextDouble();
        
      System.out.println("maximum number of v1 and v2="+max(v1,v2));
      
      System.out.println("enter double value 3");
        double v3=sc.nextDouble();
       System.out.println("maximum number of v1 , v2and v3="+max(v1,v2,v3));
    }
    public static int max(int val1,int val2){
       if(val1>val2) 
       {
           return val1;
       }
       else
       {
           return val2;
       }
    }
        public static double max(double val1,double val2){
         if(val1>val2)
         {
          return val1;   
        }
         else
         {
             return val2;
         }
    }
        public static double max(double val1,double val2,double val3){
            return(max(max(val1,val2),val3));
        }
}
