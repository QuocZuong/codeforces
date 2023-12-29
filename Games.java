import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 31;
        int n = sc.nextInt();
        int array1[] = new int[max];
        int array2[] = new int[max];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
            array2[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (array2[j] == array1[i]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
