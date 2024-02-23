import java.util.Scanner;
class Prem7
{
  public static void main(String args[]) 
{
System.out.println("Enter empid name and salary");
Scanner sc = new Scanner(System.in);

int id = sc.nextInt();
String name = sc.next();
float sal = sc.nextFloat();

System.out.println("id =" +id);
System.out.println("name ="+name);
System.out.println("salary ="+sal);
}
}
 