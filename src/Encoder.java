import java.util.Base64;
import java.util.Scanner;

public class Encoder {
    public static void encoder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data to be converted below:");

        String userInput = scanner.nextLine();
        scanner.close();

        String encodedString = Base64.getEncoder().encodeToString(userInput.getBytes());
        System.out.println("Encoded string: "+ encodedString);
    }
}