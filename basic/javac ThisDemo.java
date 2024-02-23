class Sample5
{
private int x;
Sample5()
{
 this(55);
this.metho5()
}
Sample5(int x)
{
this.x=x;
}
void method5()
{
System.out.println("x= " + x);
}
class ThisDemo
{
 public static void main(String args[])
{
 Sample5.s = new Sample5();
}
} 