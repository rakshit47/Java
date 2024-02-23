import java.io.*;

class app6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter 1st integer : ");
        float a = Float.parseFloat(br.readLine());

        System.out.print("Enter 2nd integer : ");
        float b = Float.parseFloat(br.readLine());

        System.out.println("Sum of a and b = " + (a + b));
    }
}
