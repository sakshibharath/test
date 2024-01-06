package basiccommands;
import java.util.*;
public class attendance 
{
public static void main(String []aaa)
{ float held,came,mp;
        Scanner sc=new Scanner(System.in);
        held=sc.nextInt();
        came=sc.nextInt();
        mp=sc.nextInt();
        float p=(came/held)*100;
        if(p<75)
        {
            if(mp==1)
            {
                System.out.println(Math.round(p));
                System.out.println("Allowed");
            }
            else
            {
                System.out.println(Math.round(p));
                System.out.println("Not Allowed");
                
            }
        }
        else
        {
            System.out.println(Math.round(p));
            System.out.println("Allowed");
            
        }
}  
}
