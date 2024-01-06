package Others;
import java.util.*;
public class studentinfo
{
 int papers;
 int project;
 int days;
 public void getdata()
 {
 Scanner sc=new Scanner(System.in);
 System.out.print("PAPERS PRESENTED:");
 papers=sc.nextInt();
 System.out.print("PROJECTS PRESENTED:");
 project=sc.nextInt();
 System.out.print("IPT DAYS:");
 days=sc.nextInt();
 }
 public void printdata()
 {
 System.out.println("No of papers presented: "+papers);
 System.out.println("No of project presented:"+project);
 System.out.println("No of days of IPT: "+days);
 }
}

