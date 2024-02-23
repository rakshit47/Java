class Sample3
{

double sum(double n1, double n2)
{
 double res = n1 + n2;
 return res;
}
}
class Method3
{
 public static void main(String args[])
{
Sample3 s = new Sample3();
double x = s.sum(20, 50.5);
System.out.println("sum= " + x);
}
} 