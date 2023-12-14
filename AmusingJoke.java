import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        char kyTu;
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        char c3[] = s3.toCharArray();
        int dem[] = new int[256];
        int dem2[] = new int[256];
        for (int i = 0; i < 256; i++) {
            dem[i] = 0;
            dem2[i] = 0;
        }
        for (int i = 0; i < s1.length(); i++) {
            kyTu = c1[i];
            if (c1[i] >= 'A' && c1[i] <= 'Z') {
                dem[kyTu]++;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            kyTu = c2[i];
            if (c2[i] >= 'A' && c2[i] <= 'Z') {
                dem[kyTu]++;
            }
        }
        for (int i = 0; i < s3.length(); i++) {
            kyTu = c3[i];
            if (c3[i] >= 'A' && c3[i] <= 'Z') {
                dem2[kyTu]++;
            }
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            if (dem[i] != dem2[i]) {
                System.out.println("NO");
                break;
            }
            if (i == 'Z') {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
