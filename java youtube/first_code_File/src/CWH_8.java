import java.util.Scanner;
public class CWH_8 {
public static void main(String[] args) {
    int y = 7;
    int x = ++y * 8;
    System.out.println(x);

//question 2
    float a=7/4.0f *9/2.0f;
    System.out.println(a);
    //question 3
    char grade = 'B';
   grade =(char) (grade + 8);
    System.out.println(grade);
    // decrypt the grade
    grade = (char) (grade - 8);
    System.out.println( grade);
// question 4
    Scanner sc = new Scanner(System.in );
    System.out.println( "enter your number ");
      int f = sc.nextInt();
    System.out.println(f>8);
// question 4
    System.out.println("Answer is ");
     int v = 6;
     int u = 8;
     int s= 4;
    Float g = (v^2 -u^2)/2*a*s;
    System.out.println(g);
    // question 5
   float n = 7*49/7.0f + 35/7.0f;
    System.out.println(n);

}}