import java.util.Scanner;

public class OptimalPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            long result = 0;
            result = ((1 + m) * m) / 2 + ((m + (m * n)) * n / 2) - m;
            System.out.println(result);

        }
    }
}
