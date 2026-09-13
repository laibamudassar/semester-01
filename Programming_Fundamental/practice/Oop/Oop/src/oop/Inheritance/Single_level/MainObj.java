/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Single_level;

/**
 *
 * @author PC
 */
public class MainObj {
    public static void main(String[]args){
        Saving_Account a=new Saving_Account("1267632@#&^h74h","Annexa",2000000,3453,100000);
        a.deposit();
        a.withdraw();
        a.calculateInterest();
    }
}
