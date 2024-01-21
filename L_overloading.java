public class L_overloading {
    // Method to calculate sum of two-digit numbers
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Method to calculate sum of three-digit numbers
    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method to calculate sum of four-digit numbers
    public int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        L_overloading calculator = new L_overloading();

        // Two-digit numbers
        int sum2Digit = calculator.sum(10, 20);
        System.out.println("Sum of two-digit numbers: " + sum2Digit);

        // Three-digit numbers
        int sum3Digit = calculator.sum(100, 200, 300);
        System.out.println("Sum of three-digit numbers: " + sum3Digit);

        // Four-digit numbers
        int sum4Digit = calculator.sum(1000, 2000, 3000, 4000);
        System.out.println("Sum of four-digit numbers: " + sum4Digit);
    }
}
