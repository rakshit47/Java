//WAP to rewrite the program and showing how to terminate the thread by passing the enter botton.
import java.io.*;
class MyThread extends Thread
{
boolean stop = false;
public void run()
{
int i;
 for(i=1; i <=100000; i++)
{
System.out.println(i);
if (stop) return;
}
}
}
class Shakshi1
{
public static void main(String  args[ ] ) throws IOException
{
 MyThread obj = new  MyThread();
Thread t = new Thread(obj);
t.start();
System.in.read();
obj.stop =true;
}
}