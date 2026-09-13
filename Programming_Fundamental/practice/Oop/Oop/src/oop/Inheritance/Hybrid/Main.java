/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Inheritance.Hybrid;

/**
 *
 * @author PC
 */
class Employee{
   public int employeeId;
   public String employeeName;
   public long salary;
   public Employee(int employeeId,String employeeName,long salary){
       this.employeeId=employeeId;
       this.employeeName=employeeName;
       this.salary=salary;        
   }
   public void login(){
       System.out.println(" Login Succesful");
   }
}
class SoftwareEmployee extends Employee{
 public String departement;
   public int experience ;
  public SoftwareEmployee(int employeeId,String employeeName,long salary,String departement,int experience){
super(employeeId,employeeName,salary);
this.experience=experience;
this.departement=departement;
}
  public void work(){
      System.out.println("Employee work on software development");
  }
}
class JavaDeveloper extends SoftwareEmployee{

public String framework;
public JavaDeveloper(int employeeId,String employeeName,long salary,String departement,int experience,String framework){
    super(employeeId,employeeName,salary,departement ,experience);
    this.framework=framework;
}
public void backend(){
    System.out.println("backend develpoment started");
}
}
class WebDeveloper extends SoftwareEmployee{
public String frontend;
public WebDeveloper(int employeeId,String employeeName,long salary,String departement,int experience,String frontend){
     super(employeeId,employeeName,salary,departement ,experience);
     this.frontend = frontend;
}
public void frontEnd(){
    System.out.println("frontEnd develpoment started");
}
}


public class Main {
       public static void main(String[] args) {
        JavaDeveloper javaDev = new JavaDeveloper(101,"ali",900000,"IT",3,"spring boot");
        javaDev.login();
        javaDev.work();
        javaDev.backend();
        System.out.println();

        WebDeveloper webDev = new WebDeveloper(102,"Ahmed",800000,"IT",2,"React");
          
        webDev.login();
        webDev.work();
        webDev.frontEnd();
}
}