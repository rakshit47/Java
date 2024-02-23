class Sample6
{
 int x,y;
Sample6(int x, int y)
{
 this.x = x;
 this.y = y;
}
}
class Check
{
 void Swap(Sample6 obj)
{
 int temp;
 temp = obj.x;
obj.x = obj.y;
obj.y = temp;
}
}
class ThisDemo1
{
 
 public static void main(String args[])
{
Sample6 obj1 = new Sample6(10, 20);
Check obj = new Check();
System.out.println(obj1.x+ "\t" +obj1.y);
 obj.Swap(obj1);
System.out.println(obj1.x+ "\t" +obj1.y);
}
} 