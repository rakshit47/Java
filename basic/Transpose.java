import java.io.*;
import java.util.Scanner;
class Transpose
{
  public static void main(String args[])throws IOException 

{
Scanner sc = new Scanner(System.in) ;
System.out.println("Enter row and col");
int r = sc.nextInt();
int c = sc.nextInt();
int i,j;
int arr[][] = new new int[r][c];
System.out.println("enter the element of the matrix");
for(i=0; i<r; i++)
for(j=0; j<c; j++)
arr[i][j] = sc..nextInt();
System.out.println("enter the marks");
 marks[i] = Integer.parseInt(br.readLine());
System.out.println("element of the transpose matrix");
for(i=0; i<r; i++)
{
for(j=0; j<c; j++)
System.out.print(arr[j][i]+ " ");
}
System.out.println("\n");
}    
