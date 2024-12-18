public class ForStatementChallenge {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; count < 10 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        int count = 0;

        for (int divisor = 1; divisor <= wholeNumber ; divisor++) {
            if (wholeNumber % divisor == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
