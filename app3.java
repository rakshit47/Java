import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1st number ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number ");
        b = sc.nextInt();
        System.out.print("Sum of a and b "+(a+b));
        sc.close();
    }
}
