/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author PC
 */
public class Question5 {
    public static void main(String[]args){
        int arr[]={33,44,56,77,89};
        int largest=arr[0];
        int secLargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
                      
          }
            }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secLargest && arr[i]<largest){
                secLargest=arr[i];
            }
        }
        System.out.println("Largest Number is = "+largest+" Second largest is = " +secLargest);
    }
}
