package taskdaily;

import java.util.Scanner;

public class EmpDetail 
{
public static class Employee{

 int empid;
 String name;
 float experience;
 
 public void getInput()
 {
 
  Scanner s = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = s.nextInt();
  System.out.print("Enter the name :: ");
  name = s.next();
  System.out.print("Enter the salary :: ");
  experience = s.nextFloat();
 }
 
 public void display() 
 {
   System.out.println("Employee id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + experience);
 }
 
 public static void main(String[] args) 
 {
 
  Employee e[] = new Employee[3];
  
  for(int i=0; i<3; i++) 
  {
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<3; i++) 
  {
   e[i].display();
  }}
}}
