
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            String[] splitStringArray = userInput.split(" ");

            for (int i = 0; i < splitStringArray.length; i++) {
                if(splitStringArray[i].contains("av")){
                    System.out.println(splitStringArray[i]);
                }

            }
            if (userInput.equals("")) {
                break;
            }

        }


    }
}