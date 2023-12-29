import java.util.Scanner;

public class NewYearandHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fourhours = 240;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int time = 0;
        for (int i = 1; i <= n; i++) {
            time += 5 * i;
            if ((time + k > fourhours)) {
                time -= 5 * i;
                break;
            } else
                count++;
        }
        System.out.println(count);
    }
}
