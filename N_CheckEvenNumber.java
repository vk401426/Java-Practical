public class N_CheckEvenNumber {
    public static void main(String[] args) {
        try {
            int number = 7; // Example number (you can change it to test different cases)
            checkEvenNumber(number);
            System.out.println(number + " is even.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to check if a number is even, and throw an exception if it's odd
    public static void checkEvenNumber(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception(number + " is odd. Even number expected.");
        }
    }
}
