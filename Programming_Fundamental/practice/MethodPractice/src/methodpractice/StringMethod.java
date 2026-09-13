/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
public class StringMethod {
  public static void main(String[]args){
      String test="level";
      System.out.println(test+"is palindrome:"+isPalindrome(test));
      
  } 
  public static boolean isPalindrome(String str){
    int left=0;
    int right=str.length()-1;
    str=str.toLowerCase();
    while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
           return false; 
        }
    left++;
    right--;
  }
  return true;
}
}
