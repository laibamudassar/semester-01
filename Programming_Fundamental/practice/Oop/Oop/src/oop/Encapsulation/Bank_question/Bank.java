/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Bank_question;

/**
 *
 * @author PC
 */
public class Bank {
     private String accountNumber;
    private long balance;
    public Bank(String accountNumber,long balance){
      this.accountNumber=accountNumber;
      this.balance=balance;
}
public String getAccountNumber(){
   return this.accountNumber; 
}
public long getBalance(){
   return this.balance; 
}
public void setAccountNumber(String num){
    this.accountNumber=num;
}
public void setBalance(long num){
    this.balance=num;
}
}
