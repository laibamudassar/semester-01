/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Book;

/**
 *
 * @author PC
 */
public class Book {
    public String author;
    public int pages;
    public String title;
    public Book(String author,int pages,String title){
        this.author=author;
        this.pages=pages;
        this.title=title;
        
    }
    public void openBook(){
        System.out.println("Book is open");
    }
    public void closeBook(){
        System.out.println("Book is close");
    }
}
