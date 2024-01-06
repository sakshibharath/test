package basiccommands;
import java.util.*;
class Queue1
{
 int front=0;
 int rear=0;
 int size=5;
 int[] arr=new int[size];
 Scanner sc=new Scanner(System.in);
 void insert()
 {
 if(rear>size-1)
 {System.out.println("Queue Overflow");
 }
 else
 {
	 System.out.print("Enter the elements: ");
     arr[rear++]=sc.nextInt();
 }
 }
 void delete()
 {
 if(front==0 && rear==0)
 System.out.println("Queue underflow");
 else if(front==size-1)
 {
 System.out.println(arr[front]+" is deleted");
 front=rear=0;
 }
 else
 System.out.println("The element deleted is "+arr[front++]);
 }
 void display()
 {
 if(rear>0)
 {
 System.out.print("Queue elements are: ");
 for(int i=front;i<rear;i++)
 System.out.print(arr[i]+" ");
 System.out.println();
 }
 else
 System.out.println("Queue is empty");
 }
 void f()
 {
 if(front<=rear && rear>0)
 System.out.println("The first element is: "+arr[front]);
 else
 System.out.println("Queue is empty");
 }
 void l()
 {
 if(rear>=front && rear<=size && rear>0)
 System.out.println("The last element is: "+arr[rear-1]);
 else
 System.out.println("Queue is empty");
 }
}
public class queue
{
 public static void main(String []aa)
 {
 Queue1 a=new Queue1();
 Scanner sc=new Scanner(System.in);
a.insert();
a.insert();
a.insert();
a.delete();
a.f();
a.l();
 }
}

