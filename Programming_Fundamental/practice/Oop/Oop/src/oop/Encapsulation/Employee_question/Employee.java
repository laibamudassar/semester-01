/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Encapsulation.Employee_question;

/**
 *
 * @author PC
 */
public class Employee {
     private int employee_id;
   private long employee_salary ;
   private String employee_name ;
   public Employee(int employee_id,long employee_salary,String employee_name){
       this.employee_id=employee_id;
       this.employee_salary=employee_salary;
       this.employee_name=employee_name;
   }
   public int getEmployee_id(){
       return this.employee_id;
   }
    public long getEmployee_salary(){
       return this.employee_salary;
   }
     public String getEmployee_name(){
       return this.employee_name;
   }
     public void setEmployee_id(int id){
        this.employee_id=id;
   }
    public void setEmployee_salary(long salary){
       this.employee_salary=salary;
   }
     public void setEmployee_name(String name){
        this.employee_name=name;
   } 
}
