/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Polymorphism.MethodOverloading;

/**
 *
 * @author PC
 */
public class Calculator {
    public int  multiply(int a,int b){
        return a*b;
    }
     public double  multiply(double a,double b){
        return a*b;
    }
      public double  multiply(double a,int b){
        return a*b;
    }
}
