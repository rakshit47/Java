class  A extends Thread
{
  int i;
 public void run()
{
for (i=1; i<=5; i++)
{
if(i==1) yield();
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
for (j=5; j<=15; j++)
{
 System.out.println("\t from Thread B: j=" +j);
if(j==10) stop ( );
}
System.out.println("Exit from Thread B :" );
}
}
class  C  extends Thread
{
  int k;
 public void run()
{
for (k=1; k<=5; k++)
{
 System.out.println("\t from Thread C: k=" +k);
if(k==1)
try
   {
   sleep(5000);
    }
   catch (Exception e)
 {
   }
}
System.out.println("Exit from Thread C :" );
}
}
class ThreadMethods
{
 public static void main(String args[])
{
 A threadA  = new A( );
 B threadB  = new B( );
 C threadC  = new C( );
System.out.println("stard Thread A :" );
threadA.start( );
System.out.println("stard Thread B :" );
threadB.start( );
System.out.println("stard Thread C :" );
threadC.start( );
}
}