class Prem19
{
 
 String name ;
int id ;
 void display()
{
 
System.out.println(" Hello I am =" +name);
System.out.println(" mY emloyee Id is=" +id);
}
}
class Demo1
{
 public static void main(String args[ ])
  {
    Prem19 pr = new Prem19();
    pr.name = "salvi";
    pr.id = 22;
    pr.display();
   }
}