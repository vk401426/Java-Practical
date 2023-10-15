import java.util.Scanner;

public class F_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();

        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series of first " + n + " terms:");

        // Iterate from 1 to n and calculate Fibonacci series
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // Compute the next term in the series
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
