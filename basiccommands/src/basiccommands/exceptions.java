package basiccommands;
import java.util.*;
public class exceptions
{
 public static void main(String []aa)
 {
 try
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the two numbers to perform division: ");
 int x=sc.nextInt();
 int y=sc.nextInt();
 System.out.println("Division of two numbers is "+x/y);
 System.out.print("Enter the size of array: ");
 int n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("Enter the elements: ");
 for(int i=0;i<n;i++)
 a[i]=sc.nextInt();
 System.out.print("Enter the position to print: ");
 int p=sc.nextInt();
 System.out.println("The element in that position is "+a[p-1]);
 }
 catch(ArithmeticException e)
 {
 System.out.println(e);
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
 System.out.println(e);
 }
 }
}