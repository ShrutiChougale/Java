import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CompareString {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int characters = 0;
        int words = 0;
        int lines = 0;

        System.out.println("Enter multiple lines (Press ENTER on empty line to stop):");

        while (true) {

            line = br.readLine();

            if (line.isEmpty())   // stop condition
                break;

            lines++;

            characters += line.length();

            String w[] = line.split(" ");
            words += w.length;
        }

        System.out.println("Total characters: " + characters);
        System.out.println("Total words: " + words);
        System.out.println("Total lines: " + lines);
    }
}

