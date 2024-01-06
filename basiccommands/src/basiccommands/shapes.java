package basiccommands;
import java.util.*;
abstract class shape
{
	int a;
	int b;
	void printArea()
	{
		
	}

}
class Triangle extends shape
{
	public void printArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height:");
		int h=sc.nextInt();
		System.out.println("Enter the breadth:");
		int b=sc.nextInt();
		double c=0.5*b*h;
		System.out.println("The area of the triangle is " +c);
		
	}
}
class Rectangle extends shape
{
	void printArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width:");
		int w=sc.nextInt();
		System.out.println("Enter the lenght:");
		int l=sc.nextInt();
		int m=w*l;
		System.out.println("The area of the rectangle is " +m);
	}
}
class shapes
{
	public static void main(String []aa)
	{
		Triangle t=new Triangle();
		t.printArea();
		Rectangle r=new Rectangle();
		r.printArea();
	}
}
