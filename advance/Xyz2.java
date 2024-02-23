class Demo8
{
  int a, b;
  Demo8(int x, int y)
{
 a =  x;
 b =  y;
}
 void swap (Demo8 d)
{
int temp = d.a;
d.a=d.b;
d.b=temp;
}
}
class Xyz2
{
 public static void main(String args[])
{
 Demo8 d =new Demo8(25, 35);
 System.out.println("Before calling : a="+d.a+"  b="+d.b);
 d.swap(d);
 System.out.println("After calling : a="+d.a+"  b="+d.b);
}
}

