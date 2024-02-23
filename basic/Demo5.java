class Prem22
{
 
private String name;
private int id;
 Prem22()
{
   name = "Rajendra";
   id = 45;
 }
Prem22(String s, int i)
{
  name = s;
  id = i; 
}
void display()
{

System.out.println(" Hello my name is=" +name);
System.out.println(" and my age is=" +id);
}
}
class Demo5
{
 public static void main(String args[ ])
  {
    Prem22 rohit = new Prem22();
   
    rohit.display();
    Prem22 sashi = new Prem22();
     sashi.display();
   Prem22 rupa = new Prem22();
     rupa.display();
Prem22 ram = new Prem22("sita",10);
   
    ram.display();
Prem22 manish = new Prem22("sohan",55);
   
    rohit.display();
   }
}