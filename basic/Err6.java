import java.io.*;
class Shalvi
{
 private String name;
 void accept() throws IOException
{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter name=");
name = br.readLine();
}
 void display()
{
 System.out.println("name=" +name);
}
}
class Err6
{
 public static void main(String args[]) throws IOException
{
  Shalvi s =new Shalvi();
  s.accept();
  s.display();
} 
}