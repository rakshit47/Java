class Sample7
{
void add(int x, int y)
{
 System.out.println("sum of two nos" + (x+y));
}
void add(int x, int y, int z)
{
 System.out.println("sum of three nos" + (x+y+z));
}
}

class Poly
{
 
 public static void main(String args[])
{
Sample7 s = new Sample7();
s.add(10,15);
s.add(10,15,20);
}
} 