import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadSentence {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence: ");
        String sentence = br.readLine();

        System.out.println("You entered: " + sentence);
    }
}