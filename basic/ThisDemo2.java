class Samp
{
private String name;
private int age;
public void setName(String name)
{
 this.name =name;
}
public void setAge(int age)
{
 this.age = age;
}
public String getName()
{
 return name;
}

public int getAge()
{
 return age;
}
}
class ThisDemo2
{
 public static void main(String args[])
{
 Samp s = new Samp();
s.setName("Rajendra");
s.setAge(54);
System.out.println("Name" + s.getName());
System.out.println("Age" + s.getAge());
}
} 