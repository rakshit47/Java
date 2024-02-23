class ParentClass{
	int a;
	void setData(int a) {
		this.a = a;
	}
}
class ChildClass extends ParentClass{
	void showData() {
		System.out.println("Value of a is " + a);
	}
}
class ChildChildClass extends ChildClass{
	void display() {
		System.out.println("Inside ChildChildClass!");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {

		ChildChildClass obj = new ChildChildClass();
		obj.setData(100);
		obj.showData();
		obj.display();

	}

}
