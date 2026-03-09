import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        String word = "madam";
        String reverse = new StringBuilder(word).reverse().toString();

        System.out.println("\nChecking hardcoded word: " + word);

        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a word to check palindrome: ");
        String input = scanner.nextLine();

        String reversedInput = new StringBuilder(input).reverse().toString();

        if (input.equals(reversedInput)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is Not a Palindrome");
        }

        scanner.close();
    }
}