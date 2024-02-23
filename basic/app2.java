import java.io.*;

public class app2 {
    static public void main(String[] args) throws IOException {
        String a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text : ");
        a = br.readLine();
        int b = br.read();
        System.out.println(a);
        System.out.println(Math.pow(45, b));
    }
}
