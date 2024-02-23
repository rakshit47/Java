import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Enter any number ");
        int x = sn.nextInt();
        // int 
        String res = ((x%4)==0) ? "Leap Year " : "Not Leap Year ";
        System.out.print(res);
        sn.close();
    }
}
