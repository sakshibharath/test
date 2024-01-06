package radcircle;
import java.util.*;
public class radius_of_circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r;
		System.out.println("Enter the number to find the radius of the circle:");
		r=sc.nextInt();
		float pi=3.14f;
		float rad=(pi*r);
				float rad1=rad*rad;
		System.out.println("The radius of the circle is "+rad1);
	}
}
