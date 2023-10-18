
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            //int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int e = list.get(i);
            if (e >= max) {
                max = e;
            }
        }

        System.out.println("The greatest number: " + max);

    }
}
