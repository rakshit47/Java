//Buffer Input
import java.io.*;
// import java.time.*;
public class app5 {
    public static void main(String[] args) throws IOException {
        System.out.print("\033[H\033[2J");
        String a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a integer : ");
        int b = Integer.parseInt(br.readLine()); //for integer
        System.out.print("Enter a String : ");
        a = br.readLine(); //fr string
        System.out.print("You typed "+ a);
        System.out.print(b);
        br.close();
    }
}
