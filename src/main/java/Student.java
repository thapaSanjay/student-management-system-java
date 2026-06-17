/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sanja
 */
public class Student {
    private int id;
    private String name;
    private int age;
    
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
     public int getId() {
        return id;
    }
     
     public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
      
      public void setId(int id) {
          if(id > 0) {
              this.id = id;
          }
          else {
              System.out.println("Id must be greater than 0");
          }
         
      }
      
      public void setName(String name) {
          this.name = name;
      }
      
      public void setAge(int age) {
          if(age > 0) {
            this.age = age;
          } else {
              
            System.out.println("Age must be greater than 0");
          }
        
      }
    
    public void displayStudent() {
        System.out.println("ID: "+ getId());
         System.out.println("Name: "+ getName());
          System.out.println("Age: "+ getAge());
        
    }
    
}
