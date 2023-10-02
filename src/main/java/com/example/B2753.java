import java.util.Scanner;

public class B2753 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        in.close();

        if(m%4==0) {

            if(m%400==0) System.out.println("1");
            else if(m%100==0) System.out.println("0");
            else System.out.println("1");

        }

        else System.out.println("0");
    }
}
