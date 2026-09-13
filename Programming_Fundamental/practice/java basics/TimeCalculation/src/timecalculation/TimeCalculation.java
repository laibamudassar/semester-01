/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timecalculation;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class TimeCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter sec");
        Scanner input=new Scanner(System.in);
        int sec=0;
        sec=input.nextInt();
        int min=sec/60;
        int remainingSec=sec%60;
        System.out.println(sec+":"+min+":"+remainingSec);
        
        //question 2
        System.out.println("enter hours");
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int mintues=hours*60;
        int seconds=mintues*60;
        System.out.println("hours:"+"mintues:"+"seconds");
        System.out.println(hours+":"+mintues+":"+seconds+":");
               
        
    }
    
}
