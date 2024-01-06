package basiccommands;
import java.util.*;
/*public class Midterm 
{
	public static void main(String []aa)
	{int i,n;
	int array[]=new int[10];
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
	array[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
	System.out.println(array[i]);
	}
	}

}
public class Midterm
{
	public static void main(String []aa)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int m,n;
		n=sc.nextInt();
		m=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter the elements of 3x3:");
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		arr[i][j]=sc.nextInt();
	}
}
		System.out.println("The elements of 3x3:");
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		System.out.println(arr[i][j]);
	}
}
		
	}
}
public class Midterm
{
	public static void main(String []aa)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int m,n;
		n=sc.nextInt();
		m=sc.nextInt();
		int arr1[][]=new int[m][n];
		int arr2[][]=new int[m][n];
		int sum[][]=new int[m][n];

		System.out.println("Enter the first matrix elements of 3x3:");
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		arr1[i][j]=sc.nextInt();
	}
}
System.out.println("Enter the second matrix elements of 3x3:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr2[i][j]=sc.nextInt();
}
}
System.out.println("addition of two matrix:");
for(i=0;i<m;i++){
	for(j=0;j<n;j++)
	{
		sum[i][j]=arr1[i][j]+arr2[i][j];
	}
}
for(i=0;i<m;i++){
	for(j=0;j<n;j++)
	{
		System.out.print(sum[i][j]+" ");
	}
	System.out.println();
}
		
	}
}
public class Midterm
{
	public static void main(String []aa)
	{
		int n,i;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("NUMBER:");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("MAX "+max);
		int min=arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("MIN "+min);
	}
}
import java.lang.*;
public class Midterm
{
	public static void main(String []aa)
	{
		String str="HEllo";
		String str1="Hello";
		System.out.println(str.compareTo(str1));
	}
}==========================
interface Draw
{
	public void d();
}
public class Midterm
{
	public static void main(String []aa)
	{
		Draw dd=new Draw()
				{
			public void d()
			{
				System.out.println("This lambda is quite confusing!");
				
			}
				};
				dd.d();
	}
}============================================================
public class Midterm extends Thread
{
	public void run()
	{
		System.out.println("Thread run successfully!");
	}
	public static void main(String []aa)
	{
		Midterm m=new Midterm();
		m.start();

	}
}
public class Midterm implements Runnable
{
	public void run()
	{
		System.out.println("Thread run successfully :)");
	}
	public static void main(String []aa)
	{
		Midterm m=new Midterm();
		Thread t1=new Thread(m);
		t1.run();
	}
}
*/
//===================================================================================================================//
/*import java.io.*;
public class Midterm
{
	public static void main(String []aa)
	{
		try
		{
		File abc=new File("data.txt");
		if(abc.createNewFile())
		{
			System.out.println("File is successfully created! "+abc.getName());
		}
		else
		{
			System.out.println("File already exist");
		}
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}*/
import java.io.*;
/*public class Midterm
{
	public static void main(String []aa)
	{
	try
	{
		File sc=new File("data.txt");
		Scanner Reader=new Scanner(sc);
		while(Reader.hasNextLine())
		{
			String datw=Reader.nextLine();
			System.out.println(datw);
		}
	}
	Reader.close
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
}*/
/*public class Midterm
{
	public static void main(String []aa)
	{
		try
		{
			FileWriter w=new FileWriter("data.txt");
			w.write("hello my dear sakshi!");
			w.close();
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
	}
}
public class Midterm
{
	public static void main(String []aa)
	{
			File n=new File("data.txt");
			if(n.delete())
			{
				System.out.println("Successfully deleted!");
			}
			else
			{
				System.out.println("error i del");
			}
	}
}*/
//Java program to show the usage of
//IO FileReader Class
/*class Midterm{
	public static void main(String[] args)
	{
		try {
			FileReader fw
				= new FileReader("output.txt");

			System.out.println("Reading char by char : \n");
			int i;
			while ((i = fw.read()) != -1) {
				System.out.print((char)i);
			}

			System.out.println("Reading using array : \n");
			char[] charArray = new char[10];
			fw.read(charArray);
			System.out.print(charArray);

			fw.close();
			System.out.println("FileReader closed!");
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}*/
/*public class SynchronizedProgram {
public static void main(String[] args) {
Printer printer = new Printer();
Thread thread1 = new Thread(new Runnable() {
public void run() {
for (int i = 0; i < 20; i++) {
printer.printVIT();
}
}
});
Thread thread2 = new Thread(new Runnable() {
public void run() {
for (int i = 0; i < 20; i++) {
printer.printIndia();
}
}
});
Thread thread3 = new Thread(new Runnable() {
public void run() {
for (int i = 0; i < 20; i++) {
printer.printVellore();
}
}
});
thread1.start();
thread2.start();
thread3.start();
}
private static class Printer {
private int turn = 1;
public synchronized void printVIT() {
while (turn != 1) {
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("VIT");
turn = 2;
notifyAll();
}
public synchronized void printIndia() {
while (turn != 2) {
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("India");
turn = 3;
notifyAll();
}
public synchronized void printVellore() {
while (turn != 3) {
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Vellore");
turn = 1;
notifyAll();
}
}
*/




































