import java.util.Scanner;

public class present {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int k = sc.nextInt();
            array[k] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
