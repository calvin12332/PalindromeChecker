import java.util.Scanner;

public class printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();  // Read the string
            int num = sc.nextInt();  // Read the integer
            
            // Correctly formatted output: Left-align string (15 width), right-align number (3 digits, padded with zeros)
            System.out.printf("%-15s%03d%n", str, num);
        }
        System.out.println("================================");
        
        sc.close();  // Close the scanner
    }
}