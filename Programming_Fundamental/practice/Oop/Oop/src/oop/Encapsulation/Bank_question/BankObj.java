/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Bank_question;

/**
 *
 * @author PC
 */
public class BankObj {
    public static void main(String[]args){
        Bank a=new Bank("99-@4562-2631/",4566);
        
        System.out.println("Account number and balance before modification");
        
         System.out.println(a.getAccountNumber());
        System.out.println(a.getBalance());
        String accNum="705-768-545";
        a.setAccountNumber(accNum);
        System.out.println("Account number after modification");
        System.out.println(a.getAccountNumber());
        long balance=2036600;
        a.setBalance(balance);
         System.out.println("balance after modification");
        System.out.println(a.getBalance());
    }
}