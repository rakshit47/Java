import java.io.*;
class app5{
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gen = br.readLine();
        System.out.println(gen);
        br.close();
    }
}