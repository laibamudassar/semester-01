/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Multilevel;

/**
 *
 * @author PC
 */
public class Surgeon extends Doctor {
   public String operationType;
    public String hospitalName;
    public Surgeon(String name,int age,int experince,String specialization,String operationType,String hospitalName){
        super(name,age,experince,specialization);
        this.hospitalName=hospitalName;
        this.operationType=operationType;
    }
    public void performSurgery(){
        System.out.println("Surgery performed successfully");
    }
}
