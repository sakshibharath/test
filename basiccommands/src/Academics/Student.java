package Academics;
import java.util.*;
public class Student
{
 String name;
 int rollno;
 String dept;
 char section;
 float cgpa;
 Scanner sc=new Scanner(System.in);
 public void getdata()
 {
 System.out.print("STUDENT NAME:");
 name=sc.nextLine();
 System.out.print("STUDENT ROLL:");
 rollno= Integer.parseInt(sc.nextLine());
 System.out.print("DEPARTMENT:");
 dept=sc.nextLine();
 System.out.print("SECTION:");
 section=sc.nextLine().charAt(0);
 System.out.print("CGPA:");
 cgpa=sc.nextFloat();
 }
 public void printdata()
 {
 System.out.println("STUDENT DETAILS");
 System.out.println("Name of the Student:"+name);
 System.out.println("Rollno:"+rollno);
 System.out.println("Name of Department:"+dept);
 System.out.println("Section:"+section);
 System.out.println("CGPA:"+cgpa);
 }
}
