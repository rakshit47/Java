class Demo5
{
	 String show()
	{
	 System.out.println("1");
		return null;
	}
}
class Xyz3 extends Demo5
{
	String  show()
	{
	 System.out.println("2");
	return null;
	}
	public static void main(String args[])
	{
		Demo5 d = new Demo5();
		d.show();
		Xyz3 ob= new Xyz3();
		ob.show();
	}
}