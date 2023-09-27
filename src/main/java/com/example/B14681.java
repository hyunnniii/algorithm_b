import java.io.*;
public class B14681 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a > 0 && b > 0) System.out.print(1);
        else if (a > 0 && b < 0) System.out.print(4);
        else if (a < 0 && b < 0) System.out.print(3);
        else System.out.print(2);
    }
}