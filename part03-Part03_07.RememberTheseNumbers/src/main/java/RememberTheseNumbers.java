
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int a = scanner.nextInt();
            if (a == -1) {
                break;
            }

            numbers.add(a);
        }
          for (int i = 0; i < numbers.size(); i++) {
              System.out.println(numbers.get(i));
          }
//          for (int e : numbers) {
//              System.out.println(e);
//          }

    }
}
