import java.util.Arrays;
import java.util.Scanner;

public class G_smallestnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) numbers[i] = scanner.nextInt();
        
        int smallest = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
        
        System.out.println("Smallest number among the 10 numbers is: " + smallest);
        scanner.close();
    }
}
