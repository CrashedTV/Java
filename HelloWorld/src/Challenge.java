public class Challenge {
    public static void main(String[] args) {
        double  variable1 = 20.00;
        double variable2 = 80.00;
        double result = (variable1 + variable2) * 100.00;
        System.out.println("The total value is : " + result);
        double remainder = result % 40.00;
        System.out.println("Remainder : " + remainder);
        boolean isRemainder = (remainder == 0.00) ? true : false;
        System.out.println("isRemainder = " + isRemainder);
        if(!isRemainder){
            System.out.println("Got Some Remainder");
        }
    }
}
