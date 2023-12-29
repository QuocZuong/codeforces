
import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    System.out.print("#");
                } else {
                    if (count % 2 == 0) {
                        if (j != m - 1) {
                            System.out.print(".");
                        } else {
                            System.out.print("#");
                            count++;
                        }
                    } else {
                        if (j == 0) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                            if (j == m - 1)
                                count++;
                        }
                    }
                }

            }

            System.out.println();
        }
        sc.close();
    }
}
