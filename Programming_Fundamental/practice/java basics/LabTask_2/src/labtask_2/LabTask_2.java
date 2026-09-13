/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtask_2;

/**
 *
 * @author PC
 */
public class LabTask_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int fare_Business_Seat;
       fare_Business_Seat =3500;
       int businessSeats=8;
        int fare_Economy_Seat;
       fare_Economy_Seat =2250;
       int economySeats;
        economySeats=40;
       int income= (economySeats*fare_Economy_Seat)+(businessSeats*fare_Business_Seat);
       int fuelConsume=29150;
       int staffWages=10000;
       int usage=fuelConsume+staffWages;
       int profit=income-usage;
       System.out.println("total income is= "+income);
       System.out.println("profit = "+profit);
       





    }
    
}
