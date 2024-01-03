import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String temp = sc.next();
            String[] numbers = temp.split("\\+");

            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);

            System.out.println(num1 + num2);
        }

        sc.close();
    }
}
