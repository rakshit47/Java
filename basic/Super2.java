class One 
{
 int i=10;
void show()
{
 System.out.println("super class method i = "+i);
}
}
class Two extends One
{
 int i=20;
void show()
{
 System.out.println("sub class method i = "+i);
  super.show();
System.out.println("super class method i = "+i);
}
}
class Super2
{
 public static void main(String args[])
{
  Two t = new Two();
  t.show();
}
}