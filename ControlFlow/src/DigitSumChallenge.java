public class DigitSumChallenge {
    public static void main(String[] args) {
        int number = 123456789;
        System.out.println("The sum of " + number + " is " + sumDigits(number));
    }
    public static int sumDigits(int number){
        if(number < 0){
            return -1 ;
        }
        int sum = 0;
        while (number > 9){
            sum += number % 10;
            number = number / 10;

        }
        sum += number;
        return sum;
    }
}
