import java.io.*;
import java.net.*;
import java.util.*;
class Details
{
public static void main(String args[]) throws Exception
{
  URL obj = new URL("http://www.yahoo.com/index.html");
  URLConnection conn = obj.openConnection();
  System.out.println("Date:"+ new Date(conn.getDate()));
  System.out.println("Connect-type"+ conn.getContentType());
  System.out.println("Expity:"+ conn.getExpiration());
  System.out.println("Last Modified:"+ new Date(conn.getLastModified()));
  int l = conn.getContentLength();
  System.out.println("ContentLength:"+ l);
  if(l==0)
  {
      System.out.println("content not available");
      return;
   }
   else
    {  
     int ch;
     InputStream in = conn.getInputStream();
     while((ch = in.read())!= -1)
     System.out.print((char)ch);
    }
 }
}