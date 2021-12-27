import java.util.Base64;
import java.util.Scanner;

public class Decoder {
    public static void decoder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data to be converted below:");
        // TODO Validate the input is all valid Base64 character's
        String userInput = scanner.nextLine();
        scanner.close();


        String decodedString = new String(Base64.getDecoder().decode(userInput));  
        System.out.println("Decoded string: "+ decodedString);
    }
}