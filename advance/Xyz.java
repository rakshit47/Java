class Demo4
{
	void show()
	{
	 System.out.println("1");
	}
}
class Xyz extends Demo4
	void show()
	{
	 System.out.println("2");
	}
	public static void main(String args[])
	{
		Demo4 d = new Demo4();
		d.show();
	}
}