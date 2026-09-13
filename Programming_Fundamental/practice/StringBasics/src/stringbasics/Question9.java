/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringbasics;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Question9 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    int vowels=0;
    int consonants=0;
    int ignore=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
          vowels++;  
        }
        else if(Character.isLetter(ch)){
            consonants++;
        }
        else{
           ignore++;
        }
    }
    System.out.println("vowels in string : "+vowels);
    System.out.println("consonants in string : "+consonants);
     System.out.println("there is no vowel and consonants : "+ignore);
  }  
}
