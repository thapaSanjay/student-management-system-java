
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sanja
 */
public class StudentService {
    
    public static void  searchStudent( ArrayList<Student> students, int id) {
        for(Student student: students) {
             
            if (student.getId() == id) {
                student.displayStudent();
                return;
            }
        }
         System.out.println("No Students found!");
    }
    
    public static void deleteStudent(ArrayList<Student> students, int id) {
          
          for(int i = 0; i< students.size(); i++) {
              if(students.get(i).getId() == id) {
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
            if(s.getId() == updateId) {
                s.setName(newName);
                s.setAge(newAge);
                System.out.println("Student updated successfully");
                s.displayStudent();
                return;
            }
        }
       System.out.println("Student not found");  
        
    }
    
}
