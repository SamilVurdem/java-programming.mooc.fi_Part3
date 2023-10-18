
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {

            sum += numbers.get(i);
        }
        double average = (double) sum / numbers.size();
        System.out.println("Average: " + average);
    }
}
