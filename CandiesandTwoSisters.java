import java.util.Scanner;

public class CandiesandTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            int n = sc.nextInt();
            if (n <= 2) {
                System.out.println("0");
                continue;
            }
            if (n % 2 == 0) {
                System.out.println((n / 2) - 1);
            } else {
                System.out.println((n / 2));
            }
        }
        sc.close();
    }
}
