import java.io.*;
class Prem13
{
  public static void main(String args[])throws IOException 

{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("how many subjects");
int n = Integer.parseInt(br.readLine());
int marks[] = new int[n];
int i;
for(i=0; i<n; i++)
{
System.out.println("enter the marks");
 marks[i] = Integer.parseInt(br.readLine());
}
int total = 0;
for(i=0; i<n; i++)
total+=marks[i] ;
System.out.println("total marks="+total);
float percent = (float)total/n;
System.out.println("precentage=" +percent);

}
}    
