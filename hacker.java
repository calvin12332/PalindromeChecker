import java.util.Scanner;

public class hacker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            if (sc.hasNext()) {  // Check if there's a valid string input
                String str = sc.next();
                if (sc.hasNextInt()) {  // Check if next input is an integer
                    int num = sc.nextInt();
                    System.out.printf("%-15s%03d%n", str, num);
                } else {
                    System.out.println("Invalid input! Expected an integer.");
                    sc.next(); // Consume invalid input
                }
            } else {
                System.out.println("Invalid input! Expected a string.");
            }
        }
        System.out.println("================================");
        
        sc.close();
    }
}