class Demo7
{  
 void swap(int a, int b)
{
	int temp;
	temp= a;
	a=b;
	b=temp;
	System.out.println(" Inside the Method :"+(a+"\t" +b));
}
}
class Xyz1
{
  public static void main(String args[])
  	{
	int a=10, b=20;
	Demo7 d= new Demo7();
	System.out.println(" dislpay before calling"+(a+"\t" +b));
	d.swap(a,b);
	System.out.println(" After before calling"+(a+"\t" +b));
	
	}
}