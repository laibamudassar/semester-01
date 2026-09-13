/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Single_level;

/**
 *
 * @author PC
 */
public class Account {
    public String accountNumber;
    public String accountHolder;
    public long balance;
    public Account (String accountNumber,String accountHolder,long balance){
      this.accountHolder=accountHolder;
      this.accountNumber=accountNumber;
      this.balance=balance;
                  
    }
    public void deposit(){
        System.out.println("Amount deposit succesfully");
    }
     public void withdraw(){
        System.out.println("Amount withdraw succesfully");
    }
}
