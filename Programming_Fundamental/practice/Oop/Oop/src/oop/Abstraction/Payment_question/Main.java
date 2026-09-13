/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Abstraction.Payment_question;

/**
 *
 * @author PC
 */
 interface PaymentMethod{
    public void Pay();
}
class CreditCard implements PaymentMethod {
    public void Pay(){
        System.out.println(" credit card put in machine");
    }
}
    class DebitCard implements PaymentMethod{
    public void Pay(){
        System.out.println(" Payment completed using Debit Card.");
    }
    }
class PayPal implements PaymentMethod{
    public void Pay(){
        System.out.println(" Payment completed using PayPal.");
    }
    }
    
public class Main {
  public static void main(String[]args){
    Payment(new CreditCard());
    Payment(new DebitCard());
     Payment(new PayPal());
      
  }  
  public static void Payment(PaymentMethod p){
      p.Pay();
  }
}
