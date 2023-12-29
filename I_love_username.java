import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        if (n > 1) {
            int max = array[0];
            int min = array[0];

            for (int i = 1; i < n; i++) {
                if (array[i] > max) {

                    max = array[i];
                    count++;
                }
                if (array[i] < min) {
                    min = array[i];
                    count++;
                }

            }
        }
        System.out.println(count);
        sc.close();
    }
}
