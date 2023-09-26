import java.util.Scanner;

public class ch513 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A*B);
        System.out.println(A-B);
        System.out.println(A+B);
        System.out.println(A/B);

        in.close();
    }
}
