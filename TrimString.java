
import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.trim();

        System.out.println("Original string: '" + str + "'");
        System.out.println("After trim: '" + result + "'");

        sc.close();
    }
}

