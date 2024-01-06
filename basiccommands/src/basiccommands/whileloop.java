package basiccommands;
import java.util.*;
public class whileloop {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int num;
		 System.out.println("Enter the number:");
		 num=sc.nextInt();
		 int original;
		 int remainder,reversed=0;
		 original=num;
		 while(num!=0)
		 {

			 remainder=num%10;
			 reversed=reversed*10+remainder;
			 num/=10;

		 }
		 if(original==reversed)
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("not a palindrome");
		 }
			
	}
}