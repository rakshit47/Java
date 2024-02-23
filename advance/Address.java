import java.io.*;
import java.net.*;
class Address
{
public static void main(String args[]) throws IOException
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the website name");
  String site = br.readLine();
  try{
      InetAddress ip = InetAddress.getByName(site);
      System.out.println("The IP Address is"+ ip);
   }catch(UnknownHostException ue)
    {  System.out.println(" website not found");
    }
 }
}