class Parent{
	int a;
	void setData(int a) {
		this.a = a;
	}
}
class Child extends Parent{
	void showData() {
		System.out.println("Inside Child!");
		System.out.println("Value of a is " + a);
	}
}
class ChildToo extends Parent{
	void display() {
		System.out.println("Inside ChildToo!");
		System.out.println("Value of a is " + a);
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {

		Child child_obj = new Child();
		child_obj.setData(100);
		child_obj.showData();
        
		ChildToo childToo_obj = new ChildToo();
		childToo_obj.setData(200);
		childToo_obj.display();

	}

}
