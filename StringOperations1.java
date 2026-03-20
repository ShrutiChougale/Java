
import java.util.Scanner;

public class StringOperations1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Length of string: " + str1.length());
        System.out.println("Character at index 2: " + str1.charAt(2));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Concatenation: " + str1.concat(str2));

        if(str1.equals(str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        System.out.println("Substring (0 to 3): " + str1.substring(0,3));
        System.out.println("Replace h with @: " + str1.replace('h','@'));
        System.out.println("Contains 'java'? " + str1.contains("java"));

        sc.close();
    }
}
