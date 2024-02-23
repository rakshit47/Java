import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter any number : ");
        a = sc.nextInt();
        System.out.println("Enter any number : ");
        b = sc.nextInt();
        System.out.println("Multiple of a and b is " + a * b);
        sc.close();
    }
}
