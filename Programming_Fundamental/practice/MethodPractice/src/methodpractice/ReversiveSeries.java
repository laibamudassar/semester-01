/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodpractice;

/**
 *
 * @author PC
 */
public class ReversiveSeries {

    public static double m(int i) {
        if (i == 1) return 1.0 / 3.0;
        return (double) i / (2 * i + 1) + m(i - 1);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("m(" + i + ") = " + m(i));
        }
    }
}  

