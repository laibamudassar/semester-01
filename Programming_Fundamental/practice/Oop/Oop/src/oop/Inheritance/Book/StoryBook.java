/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Book;

/**
 *
 * @author PC
 */
public class StoryBook extends Book{
   public String genre;
   public String language;
   public StoryBook(String author,int pages,String title,String genre,String language){
       super(author,pages,title);
       this.genre=genre;
       this.language=language;
   }
   public void readStory(){
       System.out.println(" i am read story book");
   }
}
