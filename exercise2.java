import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> sinhvien = new LinkedHashMap<>();
        System.out.println("So luong sinh vien ?");
        int n = sc.nextInt();
        int countAge[] = new int[100];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Name?");
            String name = sc.nextLine();
            System.out.println("Age?");
            int age = sc.nextInt();
            sinhvien.put(name, age);
            countAge[age - 1]++;
        }
        for (int i = 0; i < 100; i++) {
            if (countAge[i] >= 2) {
                for (String t : sinhvien.keySet()) {
                    if (sinhvien.get(t) == i + 1) {
                        System.out.print(t + " ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}