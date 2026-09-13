/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Employee_question;

/**
 *
 * @author PC
 */
public class EmployeeObj {
   public static void main(String[]args){
       Employee a=new Employee(34,87000,"aleea");
       System.out.println("employee id : "+a.getEmployee_id());
       System.out.println("employee salary : "+a.getEmployee_salary());
       System.out.println("employee name : "+a.getEmployee_name());
         System.out.println();
       System.out.println("after mofification");
       int id=67;
       long salary=90000;
       String name=" noor";
       a.setEmployee_id(id);
       a.setEmployee_name(name);
       a.setEmployee_salary(salary);
           
       System.out.println("employee id : "+a.getEmployee_id());
       System.out.println("employee salary : "+a.getEmployee_salary());
       System.out.println("employee name : "+a.getEmployee_name());
      
   }
}
