import java.io.*;
import java.util.Scanner;
class Prem14
{
  public static void main(String args[])throws IOException 

{
 Scanner sc = new Scanner(System.in);
System.out.print("Enter rows and coloumns");
int r = sc.nextInt();
int c = sc.nextInt();
int arr[][] = new int[r][c];
System.out.println("Enter elements of the matrix");
int i,j;
for(i=0; i<r; i++)
for(j=0; j<c; j++)
 arr[i][j] = sc.nextInt();
System.out.println("Trancepose of the matrix");
for(i=0; i<c; i++)
	{
	for(j=0; j<r; j++)
	{
	System.out.print(arr[j][i]+" ");
	}
	System.out.print(" \n");
	}
}
}

 
