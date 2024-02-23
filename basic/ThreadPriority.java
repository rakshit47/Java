class  A extends Thread
{
  int i;
 public void run()
{
System.out.println("\t Thread A start : ");
for (i=5; i<=15; i++)
{
 System.out.println("\t from Thread A : i=" +i);
}
System.out.println("Exit from Thread A :" );
}
}
class  B  extends Thread
{
  int j;
 public void run()
{
System.out.println("\t Thread B start : ");
for (j=25; j<=35; j++)
{
 System.out.println("\t from Thread B: j=" +j);
}
System.out.println("Exit from Thread B :" );
}
}
class  C  extends Thread
{
  int k;
 public void run()
{
System.out.println("\t Thread C start : ");
for (k=15; k<=25; k++)
{
 System.out.println("\t from Thread C: k=" +k);
}
System.out.println("Exit from Thread C :" );
}
}
class ThreadPriority
{
 public static void main(String args[])
{
 A threadA  = new A( );
 B threadB  = new B( );
 C threadC  = new C( );
threadC.setPriority(Thread.MAX_PRIORITY);
threadB.setPriority(threadA.getPriority( )+1);
threadA.setPriority(Thread.MIN_PRIORITY);
System.out.println("start Thread A :" );
threadA.start( );
System.out.println("start Thread B :" );
threadB.start( );
System.out.println("start Thread C :" );
threadC.start( );
}
}