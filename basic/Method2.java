class Sample2
{
 private double n1,n2;
Sample2(double x, double y)
{
 n1 =x;
 n2 = y;
}
double sum()
{
 double res = n1 + n2;
return res;

}
}
class Method2
{
 public static void main(String args[])
{
Sample2 s = new Sample2(10, 22.5);
double x = s.sum();
System.out.println("sum= " + x);
}
} 