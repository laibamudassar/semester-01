/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_selfproject;

/**
 *
 * @author PC
 */
public class Customer {
  private int age;
private String name ;
private int ID;
 private Bill bill;
private Operator operator;
public Customer(int age,String name,int ID,Bill bill,Operator operator){
    this.age=age;
    this.ID=ID;
    this.name=name;
    this.operator=operator;
    this.bill=bill;
}

public void talk(int mintue,Customer other){
   double cost=mintue*operator.getTalkingCharge;
   
}
public void message(int amount,Customer other){
    double cost=amount*operator.getTalkingCharge;
}
public void connection(double amount){
    double cost=amount*operator.getTalkingCharge;
}
public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Bill getBill() {
        return this.bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

}
