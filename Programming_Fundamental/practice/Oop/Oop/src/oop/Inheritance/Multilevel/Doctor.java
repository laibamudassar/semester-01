/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Multilevel;

/**
 *
 * @author PC
 */
public class Doctor extends person {
    public int experince;
    public String specialization;
    public Doctor(String name,int age,int experince,String specialization){
        super(name,age);
        this.experince=experince;
         this.specialization=specialization;
               
    }
    public void treatPatient(){
        System.out.println("Doctor is trating the patient");
    }
}
