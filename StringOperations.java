
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        System.out.println("Length of first string: " + str1.length());

     
        System.out.println("Uppercase: " + str1.toUpperCase());

        
        System.out.println("Lowercase: " + str1.toLowerCase());

        
        System.out.println("Concatenation: " + str1.concat(str2));

        
        if(str1.equals(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        
        String reverse = "";
        for(int i = str1.length() - 1; i >= 0; i--) {
            reverse = reverse + str1.charAt(i);
        }
        System.out.println("Reverse of first string: " + reverse);

        sc.close();
    }
}

