import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int police = 0;
        int crime = 0;
        while (n-- > 0) {
            int input = sc.nextInt();
            if (input == -1) {
                if (police > 0) {
                    police--;
                } else {
                    crime++;
                }
            } else {
                police += input;
            }
        }
        System.out.println(crime);
    }
}
