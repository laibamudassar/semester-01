/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pf_project;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Pf_Project {
    
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in); 
      int number;
     do{ 
         
         System.out.println("enter a number from 1 to 6 to select an option");
       System.out.println("1.add student");
       System.out.println("2.remove student");
       System.out.println("3.search  student record");
       System.out.println("4.to view all student");
       System.out.println("5.to view class student average");
       System.out.println("6.to update program");
       System.out.println("7.to exit program");
       if(sc.hasNextInt()){
           number=sc.nextInt();
              if (number >= 1 && number <= 7){
             switch(number){
           case 1:
               System.out.println("Its add a new student");
               add();
               break;
                case 2:
               System.out.println("Its remove student");
               remove();
               break;
                case 3:
               System.out.println("Its serach student record");
               searchStudent();
               break;
                case 4:
               System.out.println("to view all student");
               view();
               break;
                case 5:
               System.out.println(" to view class students average ");
               average();
               break;
                case 6:
              update();
               break;
                case 7:
                  System.out.println(" exit program.......");   
             }
              }
             else{
                     System.out.println("Please enter a number from 1 to 7.");
        number = 0;
    }
                     }
             
       
             else{
                      System.out.println("You put invalid input. Please enter a valid number.");
                       sc.next();   
                       number = 0;
                     } 
       }
      
     while(number!=7);
    }
  static int[] studentId = new int[100];
  static String[] studentName = new String[100];
  static int[][] marks = new int[100][5];
  static int currentStudentCount = 0;
  
  static Scanner input = new Scanner(System.in);
  public static void  add(){
     System.out.println("Enter a student ID");
          int studentID=input.nextInt();
          for(int i=0;i<currentStudentCount;i++){
              if(studentId[i]==studentID){
                  System.out.println("This ID already exists. Please enter another ID.");
                  return;
              }
          }
          input.nextLine();
          studentId [currentStudentCount]= studentID;
          
          System.out.println("Enter student name");
          String name=input.nextLine();
          studentName [currentStudentCount]= name;
          System.out.println("enter math mark");
          int mark=input.nextInt();
          
         while(mark <0||mark >100){
            System.out.println("invalid mark . Renter");
             mark=input.nextInt();  
            
          }
         marks[currentStudentCount][0]=mark;
         System.out.println("enter physics mark");
           mark=input.nextInt();
          while(mark <0||mark >100){
            System.out.println("invalid mark . Renter");
             mark=input.nextInt();
         
          }
           marks[currentStudentCount][1]=mark;
         System.out.println("enter computer science mark");
           mark=input.nextInt();
         while(mark <0||mark >100){
            System.out.println("invalid mark . Renter");
             mark=input.nextInt(); 
               }
          marks[currentStudentCount][2]=mark;
         System.out.println("enter english mark");
          mark=input.nextInt();
                  while(mark <0||mark >100){
            System.out.println("invalid mark . Renter");
             mark=input.nextInt();   
                      }
          marks[currentStudentCount][3]=mark;
         System.out.println("enter applied science mark");
           mark=input.nextInt();
         
         while(mark <0||mark >100){
            System.out.println("invalid mark . Renter");
             mark=input.nextInt(); 
            
          }
          marks[currentStudentCount][4]=mark;
      

int obtMarks=marks[currentStudentCount][0]+marks[currentStudentCount][1]+marks[currentStudentCount][2]+marks[currentStudentCount][3]+marks[currentStudentCount][4];
    double percentage=obtMarks/500.0*100;
 calculateGrade(percentage);
currentStudentCount+=1;
System.out.println("Student add sccesfuly");
  }
  public static void calculatePercentage( int i){
      
          int obtMarks=marks[i][0]+marks[i][1]+marks[i][2]+marks[i][3]+marks[i][4];
         System.out.printf("%-8d", obtMarks);
    double percentage=obtMarks/500.0*100;
    System.out.printf("%-10.2f", percentage);
    String grade = calculateGrade(percentage);
System.out.printf("%-8s", grade);
System.out.println();
      
  }
  public static String calculateGrade(double percentage){
      if(percentage>=86){
         
          String grade="A+";
   return grade;
   
}  
else if(percentage>=82){
      
        String grade="A";
   return grade;
}
else if(percentage>=78){
     
   
    String grade="B+";
   return grade;
}
else if(percentage>=74){
     
    
    String grade="B";
   return grade;
}
else if(percentage>=70){
        
    String grade="B-";
   return grade;
}
else if(percentage>=66){
        
        String grade="C+";
   return grade;
}
else if(percentage>=62){
      
        String grade="C";
   return grade;
}
else if(percentage>=58){
          String grade="C-";
   return grade;
}
else if(percentage>=54){
    
      String grade="D+";
   return grade;
}
else if(percentage>=50){
       
         String grade="D";
   return grade;
}
else{
            String grade="F";
   return grade;
}
  }
 public static void  remove(){
System.out.println("enter a studentId to remove from 1 to 100");
 int id;

    if (input.hasNextInt()) {
        id = input.nextInt();

        if (id >= 1 && id <= 100) {
             for(int i=0;i<currentStudentCount;i++){
    if(studentId[i]==id){
        currentStudentCount-=1;        
      //  System.out.println(i);
        for(int j=i;j<currentStudentCount;j++){
            studentId[j]=studentId[j+1];
            studentName[j]= studentName[j+1];
            for(int k=0;k<5;k++){
            marks[j][k]=marks[j+1][k];
            }
        }
        break;
    }
}
        } 
        else {
            System.out.println("Invalid ID. Please enter an ID from 1 to 100.");
        }
    } 
    else {
        System.out.println("Invalid input. Please enter a number.");
        input.next();
        id = 0;
    }


 }

 public static void searchStudent(){ 
System.out.println("enter a studentId to search from 1 to 100");
int searchId; 
if(input.hasNextInt()){
    searchId=input.nextInt();
          if (searchId >= 1 && searchId <= 100) {
        // continue searching
    } 
    else {
        System.out.println("Invalid ID. Please enter an ID from 1 to 100.");
        searchId = 0;
    }             
                      }
else{
     System.out.println("invalid id . Renter");
     input.next();   
          searchId = 0;
}
   for(int i=0;i<currentStudentCount;i++){
    if(studentId[i]==searchId){
   System.out.printf("studentId%d :",studentId[i]);     
System.out.printf("studentName%s :",studentName[i]);
for(int j=0;j<5;j++){
    System.out.printf("studentMarks%d :",marks[i][j]);
}
break;
 }
  }
 }
 public static void view(){
    System.out.printf("%-10s", "ID");
System.out.printf("%-15s", "Name");
System.out.printf("%-8s", "Math");
System.out.printf("%-8s", "Physics");
System.out.printf("%-8s", "CS");
System.out.printf("%-8s", "English");
System.out.printf("%-8s", "AppSci");
System.out.printf("%-8s", "Total");
System.out.printf("%-10s", "Percent");
System.out.printf("%-8s", "Grade");

System.out.println();
     for(int i=0;i<currentStudentCount;i++){
        System.out.printf("%-10d", studentId[i]);     
System.out.printf("%-15s", studentName[i]);
for(int j=0;j<5;j++){
 System.out.printf("%-8d", marks[i][j]);
    
    
}  
    calculatePercentage(i);     
     }
     }
 public static void average(){
      if(currentStudentCount == 0){
        System.out.println("No students available.");
        return;
    }
     double total=0;
        for(int i=0;i<currentStudentCount;i++){
           for(int j=0;j<5;j++){
               total=total+marks[i][j];
           }
        }
        double average=total/(currentStudentCount*5);
        System.out.println("total class avrage ="+average);
 }
 public static void update(){
     System.out.println("enter a studentId");
     int id=input.nextInt();
     for(int i=0;i<currentStudentCount;i++){
         if(studentId[i]==id){
             System.out.println("1.to update studentId");
              System.out.println("2.to update student Name");
               System.out.println("3.to update student Marks");
               int choice=input.nextInt();
               switch(choice){
                   case 1:
                 System.out.println("Enter a student ID");
          int newId=input.nextInt();
          for(int j=0;j<currentStudentCount;j++){
              if(studentId[j]==newId){
                  System.out.println("This ID already exists. Please enter another ID.");
                  return;
              }
          }
          
          studentId [i]= newId;
          break;
                   case 2:
                      input.nextLine();
                    System.out.println("Enter new name");
                    studentName[i] = input.nextLine();
                    System.out.println("Name updated successfully.");
                    break;
                   case 3:
                       System.out.println("Enter new Math mark");
                    marks[i][0] = input.nextInt();
                    while(marks[i][0]<0 || marks[i][0]>100){
                         System.out.println("invalid mark . Renter");
                        marks[i][0]=input.nextInt(); 
                    }

                    System.out.println("Enter new Physics mark");
                    marks[i][1] = input.nextInt();
                     while(marks[i][1]<0 || marks[i][0]>100){
                         System.out.println("invalid mark . Renter");
                        marks[i][1]=input.nextInt(); 
                    }
                    System.out.println("Enter new CS mark");
                    marks[i][2] = input.nextInt();
                    while(marks[i][2]<0 || marks[i][0]>100){
                         System.out.println("invalid mark . Renter");
                        marks[i][2]=input.nextInt(); 
                    }
                    System.out.println("Enter new English mark");
                    marks[i][3] = input.nextInt();
                   while(marks[i][3]<0 || marks[i][0]>100){
                         System.out.println("invalid mark . Renter");
                        marks[i][3]=input.nextInt(); 
                    }
                    System.out.println("Enter new Applied Science mark");
                    marks[i][4] = input.nextInt();
                   while(marks[i][4]<0 || marks[i][0]>100){
                         System.out.println("invalid mark . Renter");
                        marks[i][4]=input.nextInt(); 
                    }
                    System.out.println("Marks updated successfully.");
                    break;
                                          
               }
         }
     }
 }
}
