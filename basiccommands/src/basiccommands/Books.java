package basiccommands;
import java.util.*;
class company
{
 String title;
 float price;
 Scanner sc=new Scanner(System.in);
 void getdata()
 {
 System.out.print("Book Title:");
 title=sc.nextLine();
 System.out.print("Book price:");
 price=sc.nextFloat();
 }
 void putdata()
 {
 System.out.println("DETAILS OF THE BOOK");
 System.out.println("TITLE: "+title);
 System.out.println("PRICE: "+price);
 }
}
class book extends company
{
 int pgcount;
 Scanner sc=new Scanner(System.in);
 void getdata()
 {
 super.getdata();
 System.out.print("Page count:");
 pgcount=sc.nextInt();
 }
 void putdata()
 {
 super.putdata();
 System.out.println("PAGE COUNT:"+pgcount);
 }
}
class tape extends company
{
 float min;
 Scanner sc=new Scanner(System.in);
 void getdata()
 {
 System.out.print("Playing time: ");
 min=sc.nextFloat();
 }
 void putdata()
 {
 System.out.println("PLAYING TIME: "+min);
 }
}
public class Books
{
 public static void main (String[] args) 
 {
 book b=new book();
 tape t=new tape();
 b.getdata();
 t.getdata();
 b.putdata();
 t.putdata();
 }
}
