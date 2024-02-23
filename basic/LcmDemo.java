import java.util.Scanner;
class LcmDemo
{
  public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in );
System.out.println("Enter any two number" );
int a = sc .nextInt();
int b= sc .nextInt();
int g = 0;
int i;
for(i=1; i<=a;i++)
{
if (a%i== 0 && b%i==0)
g=i;
}
int lcm = a*b/g ;
System.out.println("LCM=" +lcm);
}
}
    
    
    