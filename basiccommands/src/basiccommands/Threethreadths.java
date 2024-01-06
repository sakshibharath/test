package basiccommands;
import java.util.*;
import java.lang.*;
class thread1 extends Thread
{
public void run()
{
for(int i=0;i<20;i++)
{
System.out.println("VIT");
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
class thread2 extends Thread
{
public void run()
{
for(int i=0;i<20;i++)
{
System.out.println("INDIA");
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
class thread3 extends Thread
{
public void run()
{
for(int i=0;i<20;i++)
{
System.out.println("VELLORE");
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
class Threethreads
{
public static void main(String []aa)
{
thread1 t1=new thread1();
thread2 t2=new thread2();
thread3 t3=new thread3();
Thread T1=new Thread(t1);
Thread T2=new Thread(t2);
Thread T3=new Thread(t3);
T1.start();
T2.start();
T3.start();
}
}

