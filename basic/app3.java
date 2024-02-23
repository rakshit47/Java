import java.util.Scanner;

public class app3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any number : ");
            float a = sc.nextFloat();
            System.out.print("Enter any number : ");
            float b = sc.nextFloat();
            System.out.println("Sum of two number: "+(a+b));
            sc.close();
        }
}