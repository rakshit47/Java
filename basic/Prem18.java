class Prem18
{
 
private String name = "Rajendra";
private int id = 50;
 void display()
{
 
System.out.println(" name=" +name);
System.out.println(" id=" +id);
}
}
class Demo
{
 public static void main(String args[ ])
  {
    Prem18 pr = new Prem18();
   
    pr.display();
    Prem18 mn = new Prem18();
     mn.display();
   }
} 