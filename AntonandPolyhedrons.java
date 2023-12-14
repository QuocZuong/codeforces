import java.util.Scanner;

public class AntonandPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        while (n-- > 0) {
            String s = sc.next();
            if (s.equals("Icosahedron")) {
                count += 20;
            }
            if (s.equals("Tetrahedron")) {
                count += 4;
            }
            if (s.equals("Cube")) {
                count += 6;
            }
            if (s.equals("Octahedron")) {
                count += 8;
            }
            if (s.equals("Dodecahedron")) {
                count += 12;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
