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
   
   
    public static void main(String[] args) {
       
        ArrayList<Student> students = StudentService.loadStudents();
        
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
                    StudentService.displayStudent(students);
                    break;
                    case 2:
                            System.out.println("Enter Student ID: ");
                            int searchID = input.nextInt();
                          
                            StudentService.searchStudent(students, searchID);

                    break;
                    case 3:
                         System.out.println("Enter Student ID: ");
                         int addId = input.nextInt();
                         input.nextLine();
                         System.out.println("Enter Student Name: ");
                         String name = input.nextLine();
                         System.out.println("Enter Student Age: ");
                          int age = input.nextInt();
                          if(age <= 0) {
                              System.out.println("Invalid age!");
                              return;
                          }
                          
                          boolean exists = false;

                            for (Student s : students) {
                                if (s.getId() == addId) {
                                    exists = true;
                                    break;
                                }
                            }

                            if (exists) {
                                System.out.println("Student ID already exists!");
                            } else {
                                students.add(new Student(addId, name, age));
                                students.sort((s1, s2) -> s1.getId() - s2.getId());
                                StudentService.saveStudents(students);
                            }
                          
                    break;
                    case 4:
                        System.out.println("Enter Student ID: ");
                        int deleteID = input.nextInt();
                        StudentService.deleteStudent(students,deleteID);
                        StudentService.saveStudents(students);
                    break;
                     case 5:
                        System.out.println("Enter Student ID to update: ");
                        int updateId = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter New Student Name: ");
                        String newName = input.nextLine();
                        System.out.println("Enter New Student Age: ");
                        int newAge = input.nextInt();
                        
                        StudentService.updateStudent(students,updateId, newName, newAge);
                        StudentService.saveStudents(students);
                        
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
