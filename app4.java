import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter year ");
        a = sc.nextInt();
        if(a%4==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
        sc.close();
    }
}
