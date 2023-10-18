
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] users = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.println("Enter username: ");
        String userInput = scanner.nextLine();

        System.out.println("Enter password: ");
        String passwordInput = scanner.nextLine();

        boolean isValid = false;

        for(int i = 0; i < users.length; i++) {
            if (users[i].equals(userInput) && password[i].equals(passwordInput)) {
                isValid = true;
            }
        }
            if(isValid) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }

    }
}
