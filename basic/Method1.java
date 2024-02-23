class Sample1
{
 private double n1,n2;
Sample1(double x, double y)
{
 n1 =x;
 n2 = y;
}
void sum()
{
 double res = n1 + n2;
System.out.println("sum= " + res);
}
}
class Method1
{
 public static void main(String args[])
{
Sample1 s = new Sample1(10, 22.5);
s.sum();
}
} 