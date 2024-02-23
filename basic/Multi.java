interface Father
{
 float ht=6.2f;
  void height();
}
interface Mother
{
 float ht=5.4f;
  void height();
}
class Child implements Father, Mother
{
 public void height()
{
 float ht = (Father.ht + Mother.ht)/2;
 System.out.println("child's height= " + ht);
}
}
class Multi
{
  public static void main(String args[])
{
 Child ch = new Child();
  ch.height();
}
}