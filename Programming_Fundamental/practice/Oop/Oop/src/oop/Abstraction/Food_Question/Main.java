/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Abstraction.Food_Question;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[]args){
      //  FoodDilevery f=new UberEats();
      //  f.deliverFood();
      foodDilever(new UberEats());
      foodDilever(new FoodPanda());
      
    }
    public static void foodDilever(FoodDilevery f){
        f.deliverFood();
    }
}
