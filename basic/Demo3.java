class Prem20
{
 
private String name = "Rajendra";
private int id = 50;
 void display()
{
 
System.out.println(" name=" +name);
System.out.println(" id=" +id);
}
}
class Demo3
{
 public static void main(String args[ ])
  {
    Prem20 pr = new Prem20();
   
    pr.display();
    Prem20 mn = new Prem20();
     mn.display();
   Prem20 rupa = new Prem20();
     rupa.display();
   }
} 