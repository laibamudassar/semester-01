/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class ListReferenceCopy {
  public static void main(String[]args){
    int[] list1={1,2,3,4,5};
    int list2[]={10,20,30};
    list2=list1;
    list2[1]=99;
    System.out.println(list1[1]);
    System.out.println(list2[1]);
  }  
}
