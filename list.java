
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(2);
        for (int i = 0; myList.size() < i; i++) {
            System.out.println(myList.get(i) + " ");
        }
        sc.close();
    }
}
