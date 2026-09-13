/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Student_question;

/**
 *
 * @author PC
 */
public class Student {
  public  int age;
   public  int id;
   public int nos;
   public String name;
   private String gf;              // -> private means not aceess by every one 
    // paramiterized constructor calling
   public Student(int age,int id,int nos,String name,String gf){
       this.age=age;
       this.gf=gf;
       this.nos=nos;
       this.name=name;
       this.id=id;
   }
   public void sleep(){
    System.out.println(name+" is sleep");
}
public void study(){
    System.out.println(name+" is study");
}
public void displayInfo(){
    System.out.println("name of student :"+name);
    System.out.println("name of gf :"+gf);
    System.out.println("nos :"+nos);
    System.out.println("id :"+id);
    System.out.println("age :"+age);
}
private void gfChatting(){
    System.out.println("student is chatting with"+gf);
}
}
   

