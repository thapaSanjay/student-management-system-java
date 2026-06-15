/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author sanja
 */

import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementSystem {
    
    public static void  searchStudent( ArrayList<Student> students, int id) {
        for(Student student: students) {
             
            if (student.id == id) {
                student.displayStudent();
                return;
            }
        }
         System.out.println("No Students found!");
    }
    
    public static void deleteStudent(ArrayList<Student> students, int id) {
          
          for(int i = 0; i< students.size(); i++) {
              if(students.get(i).id == id) {
                  students.remove(i);
                  System.out.printf("Student with id: %d deleted successfully!%n", id);
                  return;
              }
          }
          
           System.out.println("Student not found!");
        
    }
    
    public static void displayStudent(ArrayList<Student> students) {
        for(Student s : students) {
            s.displayStudent();
        }
    }
    
    public static void updateStudent(ArrayList<Student> students, int updateId, String newName, int newAge ) {
        
        for(Student s: students) {
            if(s.id == updateId) {
                s.name = newName;
                s.age = newAge;
                System.out.println("Student updated successfully");
                s.displayStudent();
                return;
            }
        }
       System.out.println("Student not found");  
        
    }
       
    
   

    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();
          
        Scanner input = new Scanner(System.in);
        boolean isTrue = true;
        while(isTrue) {
            System.out.println("\n=====" + " STUDENT MANAGEMENT SYSTEM " + "=====\n");
            
            System.out.println("1. View Students");
            System.out.println("2. Search Student");
            System.out.println("3. Add Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
         
            int userChoice = input.nextInt();
            switch(userChoice) {
                case 1:
                    displayStudent(students);
                    break;
                    case 2:
                            System.out.println("Enter Student ID: ");
                            int searchID = input.nextInt();
                          
                            searchStudent(students, searchID);

                    break;
                    case 3:
                         System.out.println("Enter Student ID: ");
                         int addId = input.nextInt();
                         input.nextLine();
                         System.out.println("Enter Student Name: ");
                         String name = input.nextLine();
                         System.out.println("Enter Student Age: ");
                          int age = input.nextInt();
                          students.add(new Student(addId,name, age));
                    break;
                    case 4:
                        System.out.println("Enter Student ID: ");
                        int deleteID = input.nextInt();
                        deleteStudent(students,deleteID);
                    break;
                     case 5:
                        System.out.println("Enter Student ID to update: ");
                        int updateId = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter New Student Name: ");
                        String newName = input.nextLine();
                        System.out.println("Enter New Student Age: ");
                        int newAge = input.nextInt();
                        
                        updateStudent(students,updateId, newName, newAge);
                        
                    break;
                    case 6:
                        System.out.println("Exiting....");
                        isTrue = false;
                    break;
                    default:
                        System.out.println("Invalid Options!");
                        
            }
        }
        
       
        
    }
}
