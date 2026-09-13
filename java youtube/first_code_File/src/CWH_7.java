// PERCENTAGE CULCULATOR
import java.util.Scanner;
public class CWH_7 {

 public static void main(String[] args){
     System.out.println("Enter your number");
    Scanner sc= new Scanner(System.in);
     System.out.println("Enter physic number");
    float physics= sc.nextFloat();
     System.out.println("Enter bio number");
    float bio=sc.nextFloat();
     System.out.println("Enter math number");
    float math= sc.nextFloat();
     System.out.println("Enter eng number");
    float eng= sc.nextFloat();
     System.out.println("Enter urdu number");
    float urdu= sc.nextFloat();
   float percentage =( (physics+bio+math+eng+urdu)/500*100);
     System.out.println("  Your  total percentage is");

     System.out.println(percentage);





}}