/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Student_question;

/**
 *
 * @author PC
 */
public class StudentObj {
   public static void main(String[]args){
        Student a=new Student(21,23,4,"laiba","tina");
        System.out.println(a.age);
        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println(a.nos);
       // -> this throw an error  bcz it is privte System.out.println(a.gf);
        
       a.sleep();
       a.study();
       a.displayInfo();
      // -> erroe occur bcz its private method not acess  by any water a.gfChatting();
   }
}
