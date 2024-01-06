package basiccommands;
import java.util.*;
class User
{
 String name;
 int num;
 String username;
 String password;
 Scanner sc=new Scanner(System.in);
 User()
 {
 System.out.println("Enter the name of the user:");
 name=sc.nextLine();
 System.out.println("Enter the mobile number of the user:");
 num=Integer.parseInt(sc.nextLine());
 System.out.println("Enter the username of the user:");
 username=sc.nextLine();
 System.out.println("Enter the password of the user:");
 password=sc.nextLine();
 }
 void printdata()
 {
 System.out.println("Name: "+name);
 System.out.println("Moblie Number: "+num);
 }
}
public class Sheela
{
 public static void main (String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of users:");
 int n=Integer.parseInt(sc.nextLine());
 User[] u=new User[n];
 for(int i=0;i<n;i++)
 {
 System.out.println("Enter the details of User "+(i+1));
 u[i]=new User();
 }
 System.out.println("Enter the user to be deleted: ");
 String name=sc.nextLine();
 for(int i=0;i<n;i++)
 {
 if(name.equals(u[i].name)==true)
 {
 u[i]=null;
 System.out.println("User deleted successfully");
 }
 }
 for(int i=0;i<n-1;i++)
 {
 if(u[i]==null)
 {
 u[i]=u[i+1];
 u[i+1]=null;
 }
 }
 System.out.println("After Deleting:");
 System.out.println("User Details:");
 for(int i=0;i<n;i++)
 {
 if(u[i]!=null)
 {
 System.out.println("User "+(i+1));
 u[i].printdata();
 }
 }
 
 }
}
