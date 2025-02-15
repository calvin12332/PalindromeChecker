import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        scanner.close();

        // Check if the string is a palindrome
        if (isPalindrome(original)) {
            System.out.println(original + " is a palindrome!");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Ignore case & special characters
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
