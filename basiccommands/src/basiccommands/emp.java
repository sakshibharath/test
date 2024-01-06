package basiccommands;
import java.util.*;
public class emp {

	public static void main(String[] args) {
		{
		        Scanner sc=new Scanner(System.in);
		        int inc;
		        inc=sc.nextInt();
		        if(inc>1000000)
		        {
		            int tax=(inc/100)*4;
		            System.out.println(tax);
		        }
		        else if(inc>500000 && inc<=1000000)
		        {
		            int tax=(inc/100)*2;
		            System.out.println(tax);
		        }
		        else
		        {
		            System.out.println("NIL");
		        }
		    }
		}

	}
