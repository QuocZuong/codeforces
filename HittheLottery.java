
import java.util.Scanner;

public class HittheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            if (n >= 100) {
                n = n - 100;
                count++;

            }
            if (n >= 20 && n < 100) {

                n = n - 20;
                count++;
            }
            if (n >= 10 && n < 20) {

                n = n - 10;
                count++;
            }
            if (n >= 5 && n < 10) {

                n = n - 5;
                count++;
            }
            if (n >= 1 && n < 5) {

                n = n - 1;
                count++;
            }

        }
        System.out.println(count);
        sc.close();
    }
}