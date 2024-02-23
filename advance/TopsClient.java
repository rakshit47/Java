import java.io.*;
import java.net.*;
public class TopsClient
{
public static void main(String args[])
{
  try
  {
   Socket s=new Socket("localhost",1234);
   DataOutputStream dt =new DataOutputStream(s.getOutputStream());
   dt.writeUTF(" university politechnic");
   dt.flush();
   dt.close();
   s.close();
   }catch(Exception e){  System.out.println(e);}
 }
}