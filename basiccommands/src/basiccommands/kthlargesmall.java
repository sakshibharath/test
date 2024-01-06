package basiccommands;
import java.util.*;
public class kthlargesmall
{
public static void main(String[] args)
		{ int n,i,l=0,ml=0;
			        int L[]=new int[20];
			        int ML[]=new int[20];
			        Scanner sc=new Scanner(System.in);
			        n=sc.nextInt();
			        for(i=0;i<n;++i)
			        {
			            L[i]=sc.nextInt();
			            ML[i]=sc.nextInt();
			        }
			        for(i=0;i<n;i++)
			        {
			            l=l+L[i];
			            ml=ml+ML[i];
			        }
			        if(ml>=1000)
			        {
			            l=l+ml/1000;
			        }
			        ml=ml%1000;
			        System.out.println(l);
			        System.out.println(ml);
			    }
			}


