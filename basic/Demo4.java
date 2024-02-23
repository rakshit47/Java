class Prem21
{
 
private String name;
private int id;
 Prem21()
{
   name = "shalvi";
   id = 23;
 }
void display()
{

System.out.println(" name=" +name);
System.out.println(" id=" +id);
}
}
class Demo4
{
 public static void main(String args[ ])
  {
    Prem21 rohit = new Prem21();
   
    rohit.display();
    Prem21 sashi = new Prem21();
     sashi.display();
   Prem21 rupa = new Prem21();
     rupa.display();
   }
}