import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch511 {
    public static void main(String[] args) throws IOException {
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;

        for (int i = 1; i <= 9; i++) {

            StringTokenizer st = new StringTokenizer(k.readLine());

            for (int j = 1; j <= 9; j++) {

                int G = Integer.parseInt(st.nextToken());

                if (m < G) {
                    m = G;
                }
            }
        }
        System.out.println(m);
    }
}
