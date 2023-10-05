import java.io.*;
        import java.util.*;
public class B2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int three = a * (b % 10);
        int four = a * ((b / 10)%10);
        int five = a * (b / 100);
        int six = a * b;
        sb.append(three + "\n" + four + "\n" + five + "\n" + six);
        System.out.print(sb);
    }
}