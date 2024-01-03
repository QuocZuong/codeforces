import java.util.Scanner;

public class VasyatheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        int fashionable = 0;
        int result = 0;

        if (red >= blue) {
            fashionable = blue;
            red = red - blue;
            result = red / 2;
        } else {
            fashionable = red;
            blue = blue - red;
            result = blue / 2;
        }
        System.out.print(fashionable + " ");
        System.out.print(result);
    }
}
