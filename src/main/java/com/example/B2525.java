
import java.util.Scanner;

public class B2525{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int total = 60 * A + B + C;

        if (total >= 1440) {
            total -= 1440;
            A = total / 60;
            B = total % 60;
            System.out.println(A + " " + B);
        } else {
            A = total / 60;
            B = total % 60;
            System.out.println(A + " " + B);
        }
    }

}
