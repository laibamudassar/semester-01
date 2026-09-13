/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Book;

/**
 *
 * @author PC
 */
public class MainObj {
    public static void main(String[]args){
        StoryBook b = new StoryBook("Harry Potter",350, "J.K. Rowling",  "Fantasy", "English");
        b.openBook();
        b.closeBook();
        b.readStory();
        // -> we can also print because all atributes of parent class extends in child class
        System.out.println(b.author);
    }
}
