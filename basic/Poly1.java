class Sample8
{
void Cal(double x)
{
 System.out.println("square" + (x*x));
}
}
class Sample9 extends Sample8
{
void Cal(double x)
{
 System.out.println("square root" + Math.sqrt(x));
}
}
class Poly1
{
 
 public static void main(String args[])
{
//Sample8 s1 = new Sample8();
//s1.Cal(25);
Sample9 s = new Sample9();
s.Cal(25);
}
} 