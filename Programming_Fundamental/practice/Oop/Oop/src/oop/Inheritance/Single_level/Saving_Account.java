/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Single_level;

/**
 *
 * @author PC
 */
public class Saving_Account extends Account {
    public int interestRate;
    public int minimumBalance;
    public Saving_Account(String accountNumber,String accountHolder,long balance,int interestRate,int minimumBalnace){
      super(accountNumber,accountHolder,balance);
      this.minimumBalance=minimumBalnace;
      this.interestRate=interestRate;
    }
   public void calculateInterest(){
        System.out.println("interest calculated succesfully");
    }
}
