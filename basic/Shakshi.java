//WAP to create MyThread class with run()method and then attach a thred to this MyThread class object.
class MyThread extends Thread
{
public void run()
{
int i;
 for(i=1; i <=10; i++)
{
System.out.println(i);
}
}
}
class Shakshi
{
public static void main(String args[])
{
 MyThread obj = new  MyThread();
Thread t = new Thread(obj);
t.start();
}
}