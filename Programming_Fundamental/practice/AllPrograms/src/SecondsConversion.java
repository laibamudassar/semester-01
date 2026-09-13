/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class SecondsConversion {
    public static void main(String[]args){
    int totalSec=11725;
    int hours=totalSec/3600;    
     int min=(totalSec%3600)/60;
     int sec=min%60;
     System.out.printf("11725 sec= %02d:%02d:%02d (HH:MM:SS)%n",hours,min,sec);
        
    }
}
