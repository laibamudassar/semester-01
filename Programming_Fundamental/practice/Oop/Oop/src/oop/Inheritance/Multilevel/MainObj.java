/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Multilevel;

/**
 *
 * @author PC
 */
public class MainObj {
    public static void main(String[]args){
        Surgeon s=new Surgeon("alxea",45,3,"kidney","kidney stones removing","midcare ");
       s.performSurgery();
       s.displayProfile();
       s.treatPatient();
    }
}
